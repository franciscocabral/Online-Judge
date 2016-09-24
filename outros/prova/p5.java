/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

import java.util.Scanner;
import java.util.Stack;

public class p5 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n, m;
        do {
            n = s.nextInt();
            m = s.nextInt();
            if (n == 0 && m == 0) {
                break;
            }

            Stack<Integer> garagem = new Stack<Integer>();
            boolean consegue = true;
            for (int i = 0; i < n; i++) {
                int c = s.nextInt();
                int d = s.nextInt();

                int tmp = -1;
                while (!garagem.isEmpty() && garagem.peek() <= c) {
                    if (garagem.peek() > tmp || tmp == -1) {
                        tmp = garagem.peek();
                        garagem.pop();
                    } else {
                        consegue = false;
                        break;
                    }
                }

                garagem.push(d);

                if (garagem.size() > m) {
                    consegue = false;
                }
            }

            int tmp = -1;
            while (!garagem.isEmpty()) {
                if (garagem.peek() > tmp || tmp == -1) {
                    tmp = garagem.peek();
                    garagem.pop();
                } else {
                    consegue = false;
                    break;
                }

            }

            if (garagem.size() != 0) {
                consegue = false;
            }

            if (consegue) {
                System.out.println("Sim");
            } else {
                System.out.println("Nao");
            }
        } while (true);
    }
}
