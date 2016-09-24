/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest1;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class i2006 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int e = s.nextInt();
        
        int count = 0;
        if(a == t) count++;
        if(b == t) count++;
        if(c == t) count++;
        if(d == t) count++;
        if(e == t) count++;
        System.out.println(count);
    }
}
