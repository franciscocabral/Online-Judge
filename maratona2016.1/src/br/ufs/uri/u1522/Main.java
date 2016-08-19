/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufs.uri.u1522;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author kiko5
 */
public class Main {

    public static Stack<Integer> pilha1 = new Stack<Integer>();
    public static Stack<Integer> pilha2 = new Stack<Integer>();
    public static Stack<Integer> pilha3 = new Stack<Integer>();

    public static int resolucao() {
        if (pilha1.empty() && pilha2.empty() && pilha3.empty()) {
            return 1;
        }
        if ((pilha1.empty() && pilha2.empty())
                || (pilha1.empty() && pilha3.empty())
                || (pilha2.empty() && pilha3.empty())) {
            return 0;
        }

        if (pilha1.empty()) {
            if ((pilha2.peek() + pilha3.peek()) % 3 > 0) {
                return 0;
            } else {
                pilha2.pop();
                pilha3.pop();
                return resolucao();
            }
        } else if (pilha2.empty()) {
            if ((pilha1.peek() + pilha3.peek()) % 3 > 0) {
                return 0;
            } else {
                pilha1.pop();
                pilha3.pop();
                return resolucao();
            }
        } else if (pilha3.empty()) {
            if ((pilha2.peek() + pilha1.peek()) % 3 > 0) {
                return 0;
            } else {
                pilha2.pop();
                pilha1.pop();
                return resolucao();
            }
        } else {
            int num1 = pilha1.peek();
            int num2 = pilha2.peek();
            int num3 = pilha3.peek();
            
            if ((num1 + num2 + num3) % 3 == 0) {
                pilha1.pop();
                pilha2.pop();
                pilha3.pop();
                return resolucao();
            }

            boolean pode12 = false, 
                    pode13 = false, 
                    pode23 = false;

            if ((num1 + num2) % 3 == 0) {
                pilha1.pop();
                pilha2.pop();
                pode12 = resolucao() == 1;
                pilha1.push(num1);
                pilha2.push(num2);
            } 
            if ((num2 + num3) % 3 == 0) {
                pilha2.pop();
                pilha3.pop();
                pode23 = resolucao() == 1;
                pilha2.push(num2);
                pilha3.push(num3);
            } 
            if ((num1 + num3) % 3 == 0) {
                pilha1.pop();
                pilha3.pop();
                pode13 = resolucao() == 1;
                pilha1.push(num1);
                pilha3.push(num3);
            }

            return (pode12 || pode13 || pode23) ? 1 : 0;
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            pilha1.clear();
            pilha2.clear();
            pilha3.clear();
            int somatorio = 0;
            for (int i = 0; i < n; i++) {
                int num = s.nextInt();
                somatorio += num % 3;
                if (num % 3 > 0) {
                    pilha1.push(num);
                }
                num = s.nextInt();
                somatorio += num % 3;
                if (num % 3 > 0) {
                    pilha2.push(num);
                }
                num = s.nextInt();
                somatorio += num % 3;
                if (num % 3 > 0) {
                    pilha3.push(num);
                }
            }
            if (somatorio % 3 > 0) {
                sb.append(0).append("\n");
            } else {
                sb.append(resolucao()).append("\n");
            }
            n = s.nextInt();
        }
        System.out.println(sb.toString());
    }

}
