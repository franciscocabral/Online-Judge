/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest5;

import java.util.Scanner;

public class p7 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();

        for(int i = 0; i<n; i++){
            boolean[] letras = new boolean[]
            {false,false,false,false,false,false,false,false,false,false,false,false,false,
            false,false,false,false,false,false,false,false,false,false,false,false,false};
            
            String line = s.nextLine();
            int count = 0;
            for(char c : line.toCharArray()){
                if((int)c >= 97 && (int)c<= 127){
                    if(!letras[c-97]) count++;
                    letras[c-97] = true;
                }
            }
            if(count == 26) System.out.println("frase completa");
            else if(count >= 13) System.out.println("frase quase completa");
            else System.out.println("frase mal elaborada");
            
        }
    }
}
