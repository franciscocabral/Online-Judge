/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufs.uri.u1023;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        StringBuilder sb = new StringBuilder();
        
        int cidade = 0;
        while (n > 0) {
            cidade++;
            HashMap<Integer,Integer> consumo = new HashMap<Integer,Integer>();
            int consumoTotal = 0, 
                populacao = 0;
            for(int i = 0; i < n; i++){
                int p = s.nextInt();
                int c = s.nextInt();
                int con = (int) Math.floor(c/p);
                consumoTotal += c;
                populacao += p;
                
                int tmp = 0;
                if(consumo.get(con) != null){
                    tmp = consumo.get(con);
                }
                consumo.put(con, tmp + p);
            }
            float c = consumoTotal/populacao;
            
            //DANDO TLE, melhora se fizer em tempo de inserção
            List<Integer> keys = new LinkedList<Integer>(consumo.keySet());
            Collections.sort(keys);

            Map<Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();
            for(Integer key: keys){
                sortedMap.put(key, consumo.get(key));
            }

            sb.append("Cidade# ").append(cidade).append(":\n");
            boolean first = true;
            for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
                Integer con = entry.getKey();
                Integer pop = entry.getValue();
                if(first){
                   first = false; 
                }else{
                    sb.append(" ");
                }
                sb.append(pop).append("-").append(con);
            }
            
            sb.append("\nConsumo medio: ").append(String.format(Locale.US, "%.2f", c)).append(" m3.\n");
            
            n = s.nextInt();
            if(n != 0)
                sb.append("\n");
        }
        System.out.print(sb);
    }
}
