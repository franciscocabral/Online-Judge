/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest7;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Francisco
 */
public class p6 {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for (int z = 0; z < t; z++) {
            int m = s.nextInt();
            int n = s.nextInt();
            int q = s.nextInt();

            char[][] matriz = new char[m][n];
            s.nextLine();

            for (int i = 0; i < m; i++) {
                String line = s.nextLine();
                for (int j = 0; j < n; j++) {
                    matriz[i][j] = line.charAt(j);
                }
            }
            System.out.println(m + " " + n + " " + q);

            for (int k = 0; k < q; k++) {
                int x = s.nextInt();
                int y = s.nextInt();
                char center = matriz[x][y];
                
                int i = 0;
                int tam = 1;
                boolean continua = true;
                
                while (continua) {
                    int menorX = x - i;
                    int menorY = y - i;
                    int maiorX = x + i;
                    int maiorY = y + i;
                    if((menorX >= 0 && menorY >= 0 && maiorX < m && maiorY < n)){
                        for(int a = menorX; a <= maiorX; a++){
                            if(!(matriz[a][menorY] == center && matriz[a][maiorY] == center)){
                                continua = false;
                                break;
                            }
                        }
                        for(int a = menorY+1; a < maiorY; a++){
                            if(!(matriz[menorX][a] == center && matriz[maiorX][a] == center)){
                                continua = false;
                                break;
                            }
                        }
                    }else{
                        continua = false;
                    }
                    
                    if(continua){
                        tam += 2;
                        i++;
                    }else{
                        tam -= 2;
                    }
                }
                System.out.println(tam);
            }
        }
    }
}
