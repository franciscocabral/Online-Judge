/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufs.uri.u1089;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static boolean isPico(int anterior, int atual, int proximo){
        if(anterior > atual && proximo > atual) return true;
        else if(anterior < atual && proximo < atual) return true;
        return false;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int n = s.nextInt();
        while (n > 0) {
            ArrayList<Integer> musica = new ArrayList<Integer>();
            
            for(int i = 0; i < n; i++){
                int tmp = s.nextInt();
                musica.add(tmp);
            }
            
            int primeiro = musica.get(0);
            int segundo = musica.get(1);
            int ultimo = musica.get(n-1);
            int penultimo = musica.get(n-2);
            
            int picos = 0;
            if(isPico(ultimo, primeiro, segundo)) picos++;
            if(isPico(penultimo, ultimo, primeiro)) picos++;
                
            int anterior = primeiro;
            int atual = segundo;
            int proximo;
            for(int i = 1; i < n-1; i++){
                proximo = musica.get(i+1);
                if(isPico(anterior, atual, proximo)) picos++;
                
                anterior = atual;
                atual = proximo;
            } 
            sb.append(picos).append("\n");
            n = s.nextInt();
        }
        System.out.print(sb);
    }
}
