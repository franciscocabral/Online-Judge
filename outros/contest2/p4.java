/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest2;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class p4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        while(n!=0){
            n--;
            long num = s.nextInt();
            
            long[] resultado = contar(0,num);
            System.out.println(resultado[0] +" "+ resultado[1]);
        }
    }
    public static long[] contar(long i, long num) {
        if (reverso(num) == num)
            return new long[] { i, num };
 
        return contar(i + 1, reverso(num) + num);
    }
 
    public static long reverso(long num) {
        long dig = 0, rev = 0;
        while (num > 0) {
            dig = num % 10;
            rev = rev * 10 + dig;
            num = num / 10;
        }
        return rev;
    }
}
