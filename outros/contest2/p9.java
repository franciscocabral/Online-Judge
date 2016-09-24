/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest2;

import java.util.Scanner;

public class p9 {

    public static boolean consecutive(int d1, int m1, int y1, int d2, int m2, int y2){
        if(y1 == y2){
            if(m1 == m2){
                return d1+1 == d2;
            }else{
                if(m1+1 == m2){
                    return lastDay(m1,y1) == d1 && d2 == 1;
                }else{
                    return false;
                }
            }
        }else{
            return y1+1 == y2 && m1 == 12 && m2 == 1 && d1 == 31 && d2 == 1;
        }
    }

    
    public static int lastDay(int month, int year){
        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2: return (isLeap(year)? 29 : 28);
        }
        return -1;
    }
    
    public static boolean isLeap(int year){
        return (((year%4 == 0) && (year%100 !=0)) || (year%400==0));
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       
        int n, d = 0, m = 0, y = 0, c =0;
        int ld = 0, lm = 0, ly = 0, lc = 0;
        
        int totalD, totalC;

        while (true) {
            n = s.nextInt();
            if (n == 0) break;
            totalC = 0;
            totalD = 0;
            
            for (int i = 0; i <= n; i++) {
                if(i != n){
                    d = s.nextInt();
                    m = s.nextInt();
                    y = s.nextInt();
                    c = s.nextInt();
                }
                if (i > 0) {
                    if(consecutive(ld, lm, ly, d, m, y)){
                        totalC += c - lc;
                        totalD++;
                    }
                }
                ld = d;
                lm = m;
                ly = y;
                lc = c;
            }
            System.out.println(totalD + " " + totalC);
        }
    }
}


