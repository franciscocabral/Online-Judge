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
public class p3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        String linha;
        
        boolean isValid = true;
        
        int high = 11;
        int low = 0;
        
        while (true) { //NOT EOF
            num = s.nextInt();
            if (num == 0) break;
            s.nextLine();
            linha = s.nextLine();
            
            switch (linha) {
                case "too high":
                    if(num <= low) isValid = false;
                    if(num < high) high = num;
                    break;
                case "too low":
                    if(num >= high) isValid = false;
                    if(num > low) low = num;
                    break;
                case "right on":
                    if(num > low && num < high && isValid)
                        System.out.println("Stan may be honest");
                    else
                        System.out.println("Stan is dishonest");
                    isValid = true;
                    high = 11;
                    low = 0;
                    break;
            }
        }
    }
}
