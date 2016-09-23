/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u1006;

import java.util.Scanner;

/**
 *
 * @author kiko5
 */
public class Main {
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double x = (s.nextDouble()*2 + s.nextDouble()*3+ s.nextDouble()*5)/10;
        System.out.println("MEDIA = " + String.format("%.1f", x));
    }
}
