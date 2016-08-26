/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufs.uri.u1237;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner s = new Scanner(System.in);

        while (s.hasNext()) {
            String s1 = s.nextLine();
            String s2 = s.nextLine();
            int maiorSubString = 0;
            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j < s2.length(); j++) {
                    int c = 0;
                    if (s1.charAt(i) == s2.charAt(j)) {
                        int l = j;
                        int k = i;
                        while (s1.charAt(k++) == s2.charAt(l++)) {
                            c++;
                            if (l >= s2.length() || k >= s1.length()) break;
                            
                        }
                    }
                    maiorSubString = maiorSubString < c ? c : maiorSubString;
                }
            }

            sb.append(maiorSubString).append('\n');
        }
        System.out.print(sb.toString());
    }
}
