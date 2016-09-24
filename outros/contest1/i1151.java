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
public class i1151 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int anterior = 1;
        int atual = 0;
        
        System.out.print(atual+" ");
        int t = 0;
        
        for(int i = 1; i < n-1; i++){
            t = atual;
            atual = atual+anterior;
            anterior = t;
            System.out.print(atual+" ");
        }
        System.out.println(atual+anterior);
        
    }
    
}
