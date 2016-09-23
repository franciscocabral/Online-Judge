/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.Scanner;

/**
 *
 * @author kiko5
 */
public class Main {

    public static long[][][] tabela;
    
    public static void init(){
        tabela = new long[51][51][51];
        for(int m=1; m < 51; m++){
            for(int n=1; n < 51; n++){
                for(int k=1; k<51; k++){
                    if(k==1 && m>=n)tabela[n][k][m] = 1;
                    else if(k==1) continue;
                    else if(k==n) tabela[n][k][m] = 1;
                    else{
                        for(int i = n-1; i > n-m-1 && i>0; i--){
                            tabela[n][k][m] += tabela[i][k-1][m];
                        }
                    }
                    
                }
            }
        } 
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner s = new Scanner(System.in);
        init();
        while(s.hasNext()){
            int n = s.nextInt();
            int k = s.nextInt();
            int m = s.nextInt();
            sb.append(tabela[n][k][m]).append('\n');
//            System.out.println(tabela[n][k][m]);
        }
        System.out.print(sb);
        
    }
    
}
