/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufs.uri;

import java.util.Scanner;

class main {

    public static void main() {
        Scanner s = new Scanner(System.in);
        
        int x = s.nextInt();
        int y = s.nextInt();
        
        int vx = 0;
        int vy = 0;
        int tx = 0;
        int ty = 0;
        
        while(vx >= vy){
            tx = x*vx;
            ty = y*vy;
            vx++;
            
            if(tx+x > ty){
                vy++;
            }else{
                break;
            }
        }
        
        System.out.println(vx);
    }
    
}
