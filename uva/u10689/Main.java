/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u10689;

import java.util.Scanner;

public class Main {
    public static long solve(int a, int b, int n) {
        long seq0 = a;
        long seq1 = b;
        long seqi = (seq0 + seq1) ;
        long tmp;
        for (long i = 1; i <= n; i++){
            tmp = (seq0 + seq1) % 10000;
            seq0 = seq1;
            seq1 = seqi;
            seqi = tmp;
        }
        return seqi;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for (int i = 0; i < t; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int n = s.nextInt();
            int m = s.nextInt();
            System.out.println((int)(solve(a,b,n) % Math.pow(10, m)));

        }
    }
}
