/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest2;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class p1 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m ;
        int n;
        
        while(true){
            m = s.nextInt();
            n = s.nextInt();
            
            int oldM = m;
            int oldN = n;
            int total = 0;
            
            if(m == 0 && n == 0) break;
            if(n > m) {
                int tmp = m;
                m = n;
                n = tmp;
            }
            

            if(n == 1) total = m; //Todo mundo em linha
            else if(n == 2) { //Quando existem apenas 2 linhas
                total = m/4 * 4;
                
                if(m%4 == 1){ 
                    total += 2;
                }else if(m%4 >= 2){
                    total += 4;
                }
            }else{
                total = (m*n+1)/2;
            }
            System.out.println(total+" knights may be placed on a "+oldM+" row "+oldN+" column board.");
            
        }
    }
}
