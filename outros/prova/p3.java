/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

import java.util.Scanner;

public class p3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        for(int i = 0; i < n; i++){
            String line = s.nextLine();
            line = line.trim();
            String[] words = line.split(" ");
            String response = "";
            for (String word : words) {
                if (word.length() > 0) {
                    response += word.charAt(0);
                }
            }
            System.out.println(response);
        }
    }
}
