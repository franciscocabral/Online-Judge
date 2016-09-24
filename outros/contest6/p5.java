/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest6;

import java.io.IOException;
import java.util.Scanner;

public class p5 {

    public static void main(String[] args) throws IOException {
        
        Scanner s = new Scanner(System.in);
        String line;
        
        while (s.hasNext()) {
            line = s.nextLine();
            StringBuilder dancing = new StringBuilder();
            
            boolean up = true;
            for(char c : line.toCharArray()){
                if(c != ' '){
                    String tmp = c+"";
                    if(up){
                        dancing.append(tmp.toUpperCase());
                    }else{
                        dancing.append(tmp.toLowerCase());
                    }
                    up = !up;
                }else{
                    dancing.append(' ');
                }
            }
            System.out.println(dancing.toString());
        }
    }
}
