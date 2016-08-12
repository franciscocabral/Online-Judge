/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufs.uri.u1522;

import java.util.Scanner;

/**
 *
 * @author kiko5
 */
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] pilha1 = new int[n];
        int[] pilha2 = new int[n];
        int[] pilha3 = new int[n];
        while (n != 0) {
            for (int i = n-1; i >= 0; i++) {
                pilha1[i] = (s.nextInt());
                pilha2[i] = (s.nextInt());
                pilha3[i] = (s.nextInt());
            }

            n = s.nextInt();
        }
    }

}
