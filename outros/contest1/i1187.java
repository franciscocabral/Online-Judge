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
public class i1187 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        char o = s.next().charAt(0);
        double sum = 0;
        for(int i=0; i < 12; i++){
            for(int j=0; j < 12; j++){
                double x = s.nextDouble();
                if((i == 0 && j >= 1 && j <= 10)
                  || (i == 1 && j >= 2 && j <= 9)
                  || (i == 2 && j >= 3 && j <= 8)
                  || (i == 3 && j >= 4 && j <= 7)
                  || (i == 4 && j >= 5 && j <= 6)){
                    sum += x;
                }
            }
        }
        
        if(o == 'S') System.out.printf("%.1f\n",sum);
        else System.out.printf("%.1f\n",sum/30);
    }
    
}
