/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufs.uri.u1005;

import java.util.Scanner;

/**
 *
 * @author kiko5
 */
public class Main {
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double x = (s.nextDouble()*3.5 + s.nextDouble()*7.5)/11;
        System.out.println("MEDIA = " + String.format("%.5f", x));
    }
}
