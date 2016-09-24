/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest5;

import java.util.Scanner;

public class p1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i = 0; i<n; i++){
            String line = s.next();
            int abertos = 0;
            int fechados = 0;
            for(char c : line.toCharArray()){
                if(c == '<'){
                    abertos++;
                }else if(c == '>'){
                    if(abertos > 0){
                        fechados++;
                        abertos--;
                    }
                }
            }
            System.out.println(fechados);
        }
    }
}
