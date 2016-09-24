/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

import java.util.Scanner;

public class p1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int x, y;
        if (n > m) {
            x = m;
            y = n;
        }else{
            x = n;
            y = m;
        }
        int count = 0;
        for (int i = x; i <= y; i++) {
            if(i % 13 != 0){
                count += i;
            }
        }
        System.out.println(count);
    }
}
