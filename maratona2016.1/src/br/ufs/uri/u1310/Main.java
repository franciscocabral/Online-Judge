/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufs.uri.u1310;

import java.util.Scanner;

public class Main {
    
    public static int[] aux;
    public static int[] lucro;
    
    public static int resolver(int i){
        if(aux[i] != -1) return aux[i];
        if(i == 0){ 
            aux[0] = lucro[0];
            return aux[0];
        }
        aux[i] = Math.max(resolver(i-1)+lucro[i], lucro[i]);
        return aux[i];
    }
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (s.hasNext()) {
            int n = s.nextInt();
            int custoPorDia = s.nextInt();
            lucro = new int[n];
            aux = new int[n];
            int maior = 0;
            
            for(int i=0; i<n; i++){
                lucro[i] = s.nextInt() - custoPorDia;
                aux[i] = -1;
            }
            
            for(int i=0; i<n; i++){
                int tmp = resolver(i);
                if(tmp > maior){
                    maior = tmp;
                }
            }
            
            sb.append(maior).append("\n");
        }
        System.out.print(sb.toString());
    }
}
