/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u10689;

import java.util.Scanner;
//g(n) = a*fib(n-2) + b*fib(n-1)
//Pisano period = 60/300/1500/15000

public class Main {
    public static int[] fib = new int[15005];
    public static int[] pisano = {0,60,300,1500,15000};
    
    public static long solve(int a, int b, int n, int m) {
        int num = n % pisano[m];
        long result = (a*fib[num-2]+b*fib[num-1]);
        return (int) (result % Math.pow(10,m));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        fib[0] = 0;
        fib[1] = 1;
        for(int i = 2; i < 15005; i++)
            fib[i] = fib[i-2] + fib[i-1];
        
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int n = s.nextInt();
            int m = s.nextInt();
            System.out.println(solve(a,b,n, m));

        }
    }
}
