/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u1471;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner s = new Scanner(System.in);
        
        int n, r;
        while(s.hasNext()){
            ArrayList<Integer> mergulhadores = new ArrayList<Integer>();
            ArrayList<Integer> vivos = new ArrayList<Integer>();
            n = s.nextInt();
            r = s.nextInt();
            
            for(int i = 0; i < n; i++){
                mergulhadores.add(i+1);
            }
            for(int i = 0; i < r; i++){
                vivos.add(s.nextInt());
            }
            
            if(n == r){ 
                sb.append("*");
            }else{
                mergulhadores.removeAll(vivos);
                for(int i : mergulhadores){
                    sb.append(i).append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}
