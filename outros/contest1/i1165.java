/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest1;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class i1165 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        for(int i = 0; i<n; i++){
            int num = s.nextInt();
            boolean isPrime = true;
            
            if (num%2==0 && num!=2) isPrime = false; 
            for(int j=3;j*j<=num;j+=2) {
                if(num%j==0)
                    isPrime = false;
            }
            
            if(!isPrime) System.out.println(num+" nao eh primo");
            else System.out.println(num+" eh primo");
           
        }
    }
    
}
