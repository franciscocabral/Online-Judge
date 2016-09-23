/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u1245;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner s = new Scanner(System.in);
        
        while(s.hasNext()){
            int n = s.nextInt();
            int m = s.nextInt();
            int quantosSaoFodoes = 0;
            
            for(int i = 0; i < n; i++){
                boolean fezPontoEmTodos = true;
                int desempenho;
                for(int j = 0; j < m; j++){
                    desempenho = s.nextInt();
                    fezPontoEmTodos = fezPontoEmTodos && desempenho > 0;
                }
                if(fezPontoEmTodos) quantosSaoFodoes++;
            }
            sb.append(quantosSaoFodoes).append('\n');
        }
        System.out.print(sb.toString());
    }
}
