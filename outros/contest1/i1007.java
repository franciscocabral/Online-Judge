/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest1;

import java.util.Scanner;

/**
 *Make a simple program that reads four variables named A, B, C and D. 
 * Calculate and print the difference of the product of A and B with the product 
 * of C and D (A * B - C * D).
 * @author aluno
 */
public class i1007 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
        int D = s.nextInt();
        System.out.println("DIFERENCA = "+(A * B - C * D));
    }
}
