/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest7;

import java.util.Scanner;

public class p9 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n, m;
        do {
            int regras[][] = new int[20][3];

            n = s.nextInt();
            m = s.nextInt();
            if (n == 0 && m == 0) {
                break;
            }

            for (int i = 0; i < m; i++) {
                regras[i][0] = s.nextInt();
                regras[i][1] = s.nextInt();
                regras[i][2] = s.nextInt();
            }
            
            

        } while (n != 0 && m != 0);
        System.out.print(sb.toString());
    }
}
