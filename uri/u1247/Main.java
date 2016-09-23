/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u1247;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner s = new Scanner(System.in);
        
        int d, vf, vg;
        while(s.hasNext()){
            d = s.nextInt();
            vf = s.nextInt();
            vg = s.nextInt();
            
            /**
             *       /|
             * dist / | 12
             *     /  |
             *    /___|
             *      d
             **/
            double dist = (double)Math.sqrt((144+(d*d)));
            double tf = (double) 12/vf;
            double tg = (double) (dist/vg);
            
            if(tg <= tf){
                sb.append("S\n");
            }else{
                sb.append("N\n");
            }
        }
        System.out.print(sb.toString());
    }
}
