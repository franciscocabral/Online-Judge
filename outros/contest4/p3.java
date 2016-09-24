/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author aluno
 */
public class p3 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
//
//        
//        Random rand = new Random();
//        
//        for(int i = 0; i < 64; i++){
//                int randomNum = 1 + rand.nextInt((1000 - 1) + 1); 
//                int randomNum2 = randomNum + rand.nextInt((1000 - randomNum) + 1); 
//            sb.append(randomNum2).append(" ").append(randomNum).append("\n");
//            for(int j = 0; j < randomNum2; j++){
//                int randomNum3 = 1 + rand.nextInt((randomNum2 - 1) + 1); 
//                sb.append(randomNum3).append(" ");
//            }
//            sb.append("\n");
//            for(int j = 0; j < randomNum; j++){
//                int randomNum4 = 1 + rand.nextInt((randomNum2 - 1) + 1); 
//                sb.append(randomNum4).append(" ");
//            }
//            sb.append("\n");
//        }
//        sb.append("0 0\n");
//        System.out.println(sb.toString());
        
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int q= s.nextInt();
        
        
        int caso = 0;
        while(n!=0 && q!=0){
            caso++;
            
            Vector<Integer> marables = new Vector<Integer>(n);
            for(int i = 0; i < n; i++){
                marables.add(s.nextInt());
            }
            Collections.sort(marables, null);
                
            sb.append("CASE# ").append(caso).append(":\n");
            HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
            
            int last = -1;
            for(int i = 0; i < n; i++){
                int key = marables.get(i);
                if(key != last){
                    hash.put(key, i);
                }
                last = key;
            }
            
            for(int i = 0; i < q; i++){
                int Q = s.nextInt();
                if(hash.containsKey(Q)){
                    sb.append(Q).append(" found at ").append(hash.get(Q)+1).append("\n");
                }else{
                    sb.append(Q).append(" not found\n");
                }
            }
            n = s.nextInt();
            q = s.nextInt();
        }
        System.out.print(sb.toString());
    }
}
