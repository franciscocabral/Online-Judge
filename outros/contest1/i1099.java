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
public class i1099 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            if(a > b) {
                int t = a;
                a = b;
                b = t;
            }
            int sum = 0;
            for(int j = a+1; j < b; j++){
                if(j % 2 == 1){
                    sum += j;
                }
            }
            System.out.println(sum);
        }
    }
}


