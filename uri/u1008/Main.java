/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u1008;

import java.util.Scanner;

/**
 *
 * @author kiko5
 */
public class Main {
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int horas = s.nextInt();
        double valor = s.nextDouble();
        System.out.println("NUMBER = "+num);
        System.out.println("SALARY = U$ " + String.format("%.2f", horas*valor));
    }
}
