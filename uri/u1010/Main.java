/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u1010;

import java.util.Scanner;

/**
 *
 * @author kiko5
 */
public class Main {
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        s.nextInt();
        int qtd1 = s.nextInt();
        double valor1 = s.nextDouble();
        s.nextInt();
        int qtd2 = s.nextInt();
        double valor2 = s.nextDouble();
        double total = qtd1*valor1 + qtd2*valor2;
        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", total));
    }
}
