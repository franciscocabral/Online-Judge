/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufs.uva.u10819;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static int[][] tot = new int[10201][101];
    public static int pesotot = 0;
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNext()) {
            int qtd = s.nextInt();
            int itens = s.nextInt();
            
            HashMap<Integer, Integer> pesos = new HashMap<Integer, Integer>();
            int max = 0;
            for(int i=0; i < itens; i++){
                int x = s.nextInt();
                int y = s.nextInt();
                if(y > max) max = y;
                pesos.put(x, y);
            }
            tot = new int[10201][101];
            pesotot = 0;
            mochila(pesos,qtd,max);
            System.out.println(pesotot);
        }
    }
    
    public static void mochila(HashMap<Integer, Integer> pesos,int n, int k){
        
        tot[0][0] = 1;
        for(int i = 0; i < k; i++)
            tot[0][i] = 0;
        for(int i = 1; i < n; i++){
            int peso = -1;
            if(pesos.containsKey(i)){
                peso = pesos.get(i);
            }
            for(int j = 0; j < k; j++){
                tot[i][j] = 0;
                
                if(tot[i-1][j] >= 1){
                    tot[i][j] = 1;
                }else if(j-peso >= 0 && tot[i-1][j-peso] >= 1){
                    tot[i][j] = 2;
                    pesotot += peso;
                }
            }
        }
        
    }
}
