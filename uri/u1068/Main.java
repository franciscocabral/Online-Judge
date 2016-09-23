/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u1068;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String line = s.nextLine();

            boolean correto = true;
            int abertos = 0;
            for (char c : line.toCharArray()) {
                if (c == '(') {
                    abertos++;
                } else if (c == ')') {
                    if (abertos == 0) {
                        correto = false;
                        break;
                    }
                    abertos--;
                }
            }
            if (abertos > 0) {
                correto = false;
            }
            
            if(correto) System.out.println("correct");
            else System.out.println("incorrect");
        }
    }
}
