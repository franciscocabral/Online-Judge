/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest2;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 *
 * @author aluno
 */
public class p2 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num;
        String linha;

        int erros;
        HashSet<Character> jaChutou;

        boolean arregou;

        while ((linha = in.readLine()) != null) { //NOT EOF
            num = Integer.parseInt(linha);
            if (num == -1) {
                break;
            }
            System.out.println("Round " + num);

            String palavra = in.readLine();
            String letras = in.readLine();
            jaChutou = new HashSet<Character>();
            erros = 0;
            arregou = true;
            for (int i = 0; i < letras.length(); i++) {
                char letra = letras.charAt(i);
                boolean repetida = jaChutou.add(letra);
                if (!repetida) continue;
                
                if (palavra.indexOf(letra) > -1) {
                    palavra = palavra.replace("" + letra, "");
                    if (palavra.length() == 0) {
                        System.out.println("You win.");
                        arregou = false;
                        break;
                    }
                } else {
                    erros++;
                    if (erros == 7) {
                        System.out.println("You lose.");
                        arregou = false;
                        break;
                    }
                }

            }
            if (arregou) {
                System.out.println("You chickened out.");
            }
        }

    }
}
