/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p5 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        Scanner s = new Scanner(System.in);
        int n,m;
        int caso = 1;
        
        do {
            n = s.nextInt();
            if(n==0)break;
            ArrayList<Integer> nums = new ArrayList<Integer>();
            
            for (int i = 0; i < n; i++)  nums.add(s.nextInt());
            Collections.sort(nums, null);
            
            m = s.nextInt();
            
            sb.append("Case ").append(caso++).append(":\n");
            for(int i = 0; i < m; i++){
                int q = s.nextInt();
                int somaMaisProxima = nums.get(0)+nums.get(1);
                
                for(int j = 0; nums.get(j) <= q/2 && j+1 < n; j++){
                    int k;
                    int left = j+1, right = n-1, middle = -1;
                    while(left <= right){
                        middle = (left+right)/2;
                        if(q == nums.get(middle)) break;
                        if(q > nums.get(middle)) left = middle+1;
                        else right = middle-1;
                    }
                    k = middle;
                    
                    
                    if(nums.get(j) + nums.get(k) == q){
                        somaMaisProxima = q; break;
                    }else{
                        int soma;
                        if(k-1 != j){
                            soma = nums.get(j) + nums.get(k-1);
                            somaMaisProxima = (Math.abs(somaMaisProxima-q) <= Math.abs(soma-q)) ? somaMaisProxima : soma;
                        }
                        soma = nums.get(j) + nums.get(k);
                        somaMaisProxima = (Math.abs(somaMaisProxima-q) <= Math.abs(soma-q)) ? somaMaisProxima : soma;
                        if(k+1 < n){
                            soma = nums.get(j) + nums.get(k+1);
                            somaMaisProxima = (Math.abs(somaMaisProxima-q) <= Math.abs(soma-q)) ? somaMaisProxima : soma;
                        }
                    }
                }
                sb.append("Closest sum to ").append(q).append(" is ").append(somaMaisProxima).append(".\n");
            }
        }while(n > 0);
        System.out.print(sb.toString());
    }
}
