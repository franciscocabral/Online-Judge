/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest6;

import java.util.Scanner;

public class p2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int horas = n / 60 / 60;
        int minutos = (n-(horas * 60 * 60)) / 60;
        int segundos = n % 60;
        System.out.println(horas+":"+minutos+":"+segundos);
        
    }
}
