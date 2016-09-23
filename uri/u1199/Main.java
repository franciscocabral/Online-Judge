/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u1199;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner s = new Scanner(System.in);
        String num = s.next();
        while(num.charAt(0) != '-'){
            if(num.length() > 2 && num.charAt(1) == 'x'){
                sb.append(Integer.parseInt(num.substring(2), 16 )).append('\n');
            } else{
                sb.append("0x").append(Integer.toHexString(new Integer(num)).toUpperCase()).append('\n');
            }
            num = s.next();
        }
        System.out.print(sb.toString());
    }
}
