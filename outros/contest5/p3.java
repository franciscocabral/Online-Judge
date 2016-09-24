/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class p3 {
    static class time{
       int numero;
       int pontos;
       int marcados;
       int tomados;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner s = new Scanner(System.in);
        int n;
        int z = 1;
        boolean first = true;
        do{
            n = s.nextInt();
            if(n == 0 )break;
            ArrayList<time> times = new ArrayList<time>();
            
            for(int i = 0; i < n; i++){
                time t = new time();
                t.numero = i+1;
                times.add(t);
            }
            
            for(int i = 1; i <= (n*(n-1))/2; i++){
                int time1 = s.nextInt();
                int pontos1 = s.nextInt();
                int time2 = s.nextInt();
                int pontos2 = s.nextInt();
                
                int vencedor = pontos1 > pontos2 ? time1 : time2;
                int pv       = vencedor == time1 ? pontos1 : pontos2;
                int perdedor = pontos1 < pontos2 ? time1 : time2;
                int pp       = perdedor == time1 ? pontos1 : pontos2;
                
                time v = times.get(vencedor-1);
                v.marcados += pv;
                v.tomados  += pp;
                v.pontos   += 2;
                times.set(vencedor-1, v);
                
                time p = times.get(perdedor-1);
                p.marcados += pp;
                p.tomados  += pv;
                p.pontos   += 1;
                times.set(perdedor-1, p);
            }
            
            Collections.sort(times, new Comparator<time>() {
                @Override
                public int compare(time o1, time o2) {
                    if(o1.pontos != o2.pontos) return o2.pontos - o1.pontos;
                    else{
                        double o1Razao = (o1.tomados > 0) ? (double)o1.marcados/(double)o1.tomados : o1.marcados;
                        double o2Razao = (o2.tomados > 0) ? (double)o2.marcados/(double)o2.tomados : o2.marcados;
                        if(o1Razao != o2Razao) return (o2Razao - o1Razao) > 0 ? 1 : -1;
                        if(o1.marcados != o2.marcados) return o2.marcados - o1.marcados;
                        return o2.numero - o1.numero;
                    }
                }
            });
            if(first) first = false;
            else{
                sb.append("\n");
            }
            sb.append("Instancia ").append(z++).append("\n");
            for(int i = 0; i < n-1; i++){
                sb.append(times.get(i).numero).append(" ");
            }
            sb.append(times.get(n-1).numero).append("\n");
            
        }while(n != 0);
        System.out.print(sb.toString());
    }
}
