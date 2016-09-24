/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest3;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Fancisco
 */
public class p7 {

    public static boolean determinante(int x1, int y1,  int x2, int y2,  int x3, int y3){
        int sum1 = (x1*y2*1)+(y1*1*x3)+(1*x2*y3);
        int sum2 = (1*y2*x3)+(x1*1*y3)+(y1*x2*1);
        return sum1 == sum2;
    }
    
    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][][] m;
        int[][] count, row, col;
        int[][] dig;
        int z = 1;
        while(n != 0) {
            m = new int[n][n][n];
            count = new int[n][n];
            row = new int[n][n];
            col = new int[n][n];
            dig = new int[2][n];
            
            boolean found = false;
            boolean white = true;
            
            String winner = "Empate";
            
            System.out.println("Instancia "+z);
            
            int c = 0;
            while(c < n*n*n){
                int X = s.nextInt();
                int Y = s.nextInt();
                int x = X-1;
                int y = Y-1;
                m[x][y][count[x][y]] = white? 1: 2;
                row[x][count[x][y]]++;
                col[y][count[x][y]]++;
                if(determinante(x, y, n-1, n-1, 0, 0)){
                    dig[0][count[x][y]]++;
                }
                if(determinante(x, y, 0, n-1, n-1, 0)){
                    dig[1][count[x][y]]++;
                }
                
                if(!found){
                    //Verifica as linhas
                    if(row[x][count[x][y]] >= n){
                        boolean tmp = true;
                        for(int i = 0; i <n; i++){
                            if(m[x][i][count[x][y]] != m[x][y][count[x][y]]) {
                                tmp = false;
                                break;
                            }
                        }
                        if(tmp) found = true;
                    }
                    
                    //Verifica as colunas
                    if(col[y][count[x][y]] >= n){
                        boolean tmp = true;
                        for(int i = 0; i <n; i++){
                            if(m[i][y][count[x][y]] != m[x][y][count[x][y]]) {
                                tmp = false;
                                break;
                            }
                        }
                        if(tmp) found = true;
                    }
                    
                    //Verifica as Verticais
                    if(count[x][y] >= n){
                        boolean tmp = true;
                        for(int i = 0; i <n; i++){
                            if(m[x][y][i] != m[x][y][count[x][y]]) {
                                tmp = false;
                                break;
                            }
                        }
                        if(tmp) found = true;
                    }
                     
                    //Verifica as Diagonais Horizondais Principais
                    if(dig[0][count[x][y]] >= n){
                        boolean tmp = true;
                        for(int i = 0; i <n; i++){
                            if(m[i][i][count[x][y]] != m[x][y][count[x][y]]) {
                                tmp = false;
                                break;
                            }
                        }
                        if(tmp) found = true;
                    }
                    
                    //Verifica as Diagonais Horizondais Secundárias
                    if(dig[1][count[x][y]] >= n){
                        boolean tmp = true;
                        for(int i = 0; i <n; i++){
                            if(m[i][n-1-i][count[x][y]] != m[x][y][count[x][y]]) {
                                tmp = false;
                                break;
                            }
                        }
                        if(tmp) found = true;
                    }
                    
                    
                    if(found){
                        if(white) winner = "Branco ganhou";
                        else winner = "Azul ganhou";
                    }
                }
                white = !white;
                count[x][y]++;
                
                c++;
            }
            System.out.println(winner+"\n");
            n = s.nextInt();
            z++;
        }

    }
}
