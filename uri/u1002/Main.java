/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u1002;

import java.util.Scanner;

/**
 *
 * @author kiko5
 */
public class Main {
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double area = 3.14159 * Math.pow(s.nextDouble(),2);
        System.out.println("A=" + String.format("%.4f", area));
    }
}
