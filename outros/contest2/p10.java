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
public class p10 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int c, d;
        for(int i = 0; i<t; i++){
            c = s.nextInt();
            d = s.nextInt();
            int total = (int) (Math.pow(26,c) * Math.pow(10,d));
            if(total == 1) total = 0;
            
            System.out.println(total);
            
        }


    }
}
