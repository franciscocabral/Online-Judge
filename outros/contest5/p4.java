/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class p4 {

    public static boolean alphaNum(char c) {
        return Character.isAlphabetic(c) || Character.isDigit(c);
    }

    public static void main(String[] args) throws IOException {
        HashMap<Character, Integer> prioridades = new HashMap<Character, Integer>();
        prioridades.put('^', 6);
        prioridades.put('*', 5);
        prioridades.put('/', 5);
        prioridades.put('+', 4);
        prioridades.put('-', 4);
        prioridades.put('>', 3);
        prioridades.put('<', 3);
        prioridades.put('=', 3);
        prioridades.put('#', 3);
        prioridades.put('.', 2);
        prioridades.put('|', 1);
        prioridades.put('(', 0);

        StringBuilder sb = new StringBuilder();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {

            Queue<Character> caracteres = new LinkedList<Character>();
            String pos = "";
            boolean erroLexico = false;
            boolean erroSintatico = false;

            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) != '\0') {
                    break;
                }
                char caracter = line.charAt(i);

                if (alphaNum(caracter)) {
                    if (i == 0 || !alphaNum(line.charAt(i - 1))) {
                        pos += caracter;
                    } else {
                        erroSintatico = true;
                        break;
                    }
                } else if (caracter == '(') {
                    caracteres.add(caracter);
                } else if (caracter == ')') {
                    while (!caracteres.isEmpty() && caracteres.peek() != '(') {
                        pos += caracteres.remove();
                    }
                    if (!caracteres.isEmpty()) {
                        caracteres.remove();
                    } else {
                        erroSintatico = true;
                        break;
                    }
                } else if (prioridades.containsKey(caracter)) {
                    while (!caracteres.isEmpty() && prioridades.get(caracteres.peek()) >= prioridades.get(caracter)) {
                        pos += caracteres.remove();
                    }
                    caracteres.add(caracter);
                } else {
                    erroLexico = true;
                    break;
                }
            }
            System.out.println("1 "+erroSintatico);
            while (!caracteres.isEmpty() && caracteres.peek() != '(') {
                pos += caracteres.remove();
            }

            if (!caracteres.isEmpty()) {
                erroSintatico = true;
            }

            Queue<String> valido = new LinkedList<String>();;

            if (!erroLexico && !erroSintatico) {
                pos += '\0';

                for (int i = 0; i < pos.length(); i++) {
                    if (line.charAt(i) != '\0') {
                        break;
                    }
                    char caracter = pos.charAt(i);
                    if (alphaNum(caracter)) {
                        valido.add(caracter + "");
                    } else {
                        String tmp1 = "", tmp2 = "";
                        if (!valido.isEmpty()) {
                            tmp2 = valido.remove();
                        } else {
                            erroSintatico = true;
                            break;
                        }

                        if (!valido.isEmpty()) {
                            tmp1 = valido.remove();
                        } else {
                            erroSintatico = true;
                            break;
                        }

                        valido.add(tmp1 + caracter + tmp2);
                    }
                }
            System.out.println("2 "+valido.peek());

                if (valido.size() != 0) {
                    erroSintatico = true;
                }
            }

            if (erroLexico) {
                System.out.println("Lexical Error!");
            } else if (erroSintatico) {
                System.out.println("Syntax Error!");
            } else {
                System.out.println(caracteres);
            }
        }
    }
}
