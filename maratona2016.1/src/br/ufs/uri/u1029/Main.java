/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufs.uri.u1029;

import java.util.Scanner;

public class Main {
    public static int calls = 0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n; i++){
            int x = s.nextInt();
            calls = -1;
            int fibx = fib(x);
            sb.append("fib(").append(x).append(") = ").append(calls).append(" calls = ").append(fibx).append("\n");
        }
        
        System.out.print(sb);
    }
    
    public static int fib(int n){
        calls++;
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fib(n-1) + fib(n-2);
    }
    
}
