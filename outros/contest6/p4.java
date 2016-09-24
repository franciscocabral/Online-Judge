/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest6;

import java.io.IOException;
import java.util.Scanner;

public class p4 {

    public static void main(String[] args) throws IOException {
        
        Scanner s = new Scanner(System.in);
            
        long x,y;
        
        while (s.hasNext()) {
            x = s.nextLong();
            y = s.nextLong();
            System.out.println((long)(x ^ y));
        }
    }
}
