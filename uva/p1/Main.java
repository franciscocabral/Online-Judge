/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kiko5
 */
public class Main {

    public static boolean solve(ArrayList<Integer> list, int tot){
        int m = list.size();
        
        if(tot%2 > 0) return false;
        int max = tot/2;
        
        for(int i = 0; i < m; i++){
            if(list.get(i) > max) return false;
            if(list.get(i) == max) return true;
            
            ArrayList<Integer> tmp = (ArrayList<Integer>)list.clone();
            
            tmp.remove(i);
            while(tmp.size() > 0){
                int sum = list.get(i);
                for(int j = 0; j < tmp.size(); j++){
                    sum += tmp.get(j);
                    if(sum == max) return true;
                }
                tmp.remove(0);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        s.nextLine();
        
        for(int i = 0;i < m; i++){
            String input = s.nextLine();
            
            String tmp[] =input.split(" ");
            ArrayList<Integer> pesos = new ArrayList<Integer>();
            int tot = 0;
            for (String tmp1 : tmp) {
                pesos.add(new Integer(tmp1));
                tot += new Integer(tmp1);
            }
            
            sb.append(solve(pesos, tot)?"YES":"NO").append("\n");
        }
        System.out.print(sb);
        
    }
    
}
