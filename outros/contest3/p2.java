/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest3;

import java.io.IOException;
import java.util.Scanner;



/**
 *
 * @author Fancisco
 */
public class p2 {
    
    public static double hp(double iv, double bhp, double ev, double l){
        return (((iv + bhp + (Math.sqrt(ev)/8)+50)*l)/50)+10;
    }
    public static double s(double iv, double bs, double ev, double l){
        return (((iv + bs + (Math.sqrt(ev)/8))*l)/50)+5;
    }
   
    
    public static void main(String[] args) throws IOException {
        
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        StringBuilder resp = new StringBuilder();
        for(int i = 0; i<t; i++){
            String P = s.next();
            int l = s.nextInt();
            
            resp.append("Caso #"+(i+1)+": "+P+" nivel "+l+"\n");
            //1 = HP; 2 = AT; 3 = DF; 4 = SP
            for(int j = 1; j<=4; j++){
                int bs = s.nextInt();
                int iv = s.nextInt();
                int ev = s.nextInt();
                int result = 0;
                if(j == 1)
                    result = (int) hp(iv, bs, ev, l);
                else
                    result = (int) s(iv, bs, ev, l);
                
                if(j==1) resp.append("HP: "+result+"\n");
                else if(j==2) resp.append("AT: "+result+"\n");
                else if(j==3) resp.append("DF: "+result+"\n");
                else if(j==4) resp.append("SP: "+result+"\n");
            }
        }
        System.out.print(resp);
        
    }
}