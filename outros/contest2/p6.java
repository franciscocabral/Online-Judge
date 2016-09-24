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
public class p6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h1,m1,h2,m2;

        do {
            h1 = s.nextInt();
            m1 = s.nextInt();
            h2 = s.nextInt();
            m2 = s.nextInt();
            if(h1 == 0 && m1 == 0 && h2 == 0 && m2 == 0 ) break;
            int total = 0;
            
            m1 = m1 + (h1*60);
            m2 = m2+(h2*60);
            
            if(m2 < m1){
                total = 1440 - m1;
                m1 = 0;
            }
            total += m2-m1;
            
            System.out.println(total);
        } while (true);

    }
}
