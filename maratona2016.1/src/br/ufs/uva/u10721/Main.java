/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufs.uva.u10721;

import java.util.Scanner;

public class Main {

    static long[][][] tabela = new long[51][51][51];

    public static void init() {
        tabela = new long[51][51][51];
        for(int m=1; m < 51; m++){
            for(int n=1; n < 51; n++){
                for(int k=1; k < 51; k++){
                    if(k == 1 && n <= m) tabela[n][k][m] = 1;
                    else if(k == 1) continue;
                    else if (k == n) tabela[n][k][m] = 1;
                    else if (k == n-1) tabela[n][k][m] = k;
                    else{
                        for(int i = n-1; i > n-m-1 && i>0; i--){
                            tabela[n][k][m] += tabela[i][k-1][m];
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        init();
        while(s.hasNext()){
            int n = s.nextInt();
            int k = s.nextInt();
            int m = s.nextInt();
            sb.append(tabela[n][k][m]).append("\n");
//            System.out.println(tabela[n][k][m]);
        }
        System.out.print(sb);
    }

}
