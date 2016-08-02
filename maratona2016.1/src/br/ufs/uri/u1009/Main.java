/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufs.uri.u1009;

import java.util.Scanner;

/**
 *
 * @author kiko5
 */
public class Main {
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        s.next();
        double salario = s.nextDouble();
        double vendas = s.nextDouble();
        System.out.println("TOTAL = R$ " + String.format("%.2f", salario + (vendas*0.15)));
    }
}
