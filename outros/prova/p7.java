/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

import java.util.Scanner;

/**
 *
 * @author Fancisco
 */
public class p7 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        char o = s.next().charAt(0);
        double sum = 0;
        for(int i=0; i < 12; i++){
            for(int j=0; j < 12; j++){
                double x = s.nextDouble();
                if((j == 0 && i >= 1 && i <= 10)
                  || (j == 1 && i >= 2 && i <= 9)
                  || (j == 2 && i >= 3 && i <= 8)
                  || (j == 3 && i >= 4 && i <= 7)
                  || (j == 4 && i >= 5 && i <= 6)){
                    sum += x;
                }
            }
        }
        
        if(o == 'S') System.out.printf("%.1f\n",sum);
        else System.out.printf("%.1f\n",sum/30);
    }
    
}

