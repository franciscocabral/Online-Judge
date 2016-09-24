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
public class i1929 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
        int D = s.nextInt();
        
        if(isTriangle(A, B, C)) System.out.println("S");
        else if(isTriangle(A, B, D)) System.out.println("S");
        else if(isTriangle(A, D, C)) System.out.println("S");
        else if(isTriangle(D, B, C)) System.out.println("S");
        else System.out.println("N");
    }
    
    public static boolean isTriangle(int a, int b, int c){
        if(a+b > c && b+c > a && c+a > b) return true;
        return false;
    }
}
