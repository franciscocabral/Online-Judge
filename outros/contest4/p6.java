/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest4;

import java.util.ArrayList;
import java.util.Scanner;
public class p6 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner s = new Scanner(System.in);
        int g, p;
        do {
            g = s.nextInt();
            p = s.nextInt();
            if (g == 0 && p == 0) {
                break;
            }

            int[][] ordemDeChegada = new int[101][101];
            int[] placar;

            for (int i = 0; i < g; i++) {
                for (int j = 1; j <= p; j++) {
                    int posicao = s.nextInt();
                    ordemDeChegada[i][posicao - 1] = j;
                }
            }

            int S = s.nextInt();

            for (int a = 0; a < S; a++) {
                placar = new int[101];
                int quantosPontuarao = s.nextInt();
                for (int i = 0; i < quantosPontuarao; i++) {
                    int pontuacao = s.nextInt();
                    for (int j = 0; j < g; j++) {
                        placar[ordemDeChegada[j][i]] += pontuacao;
                    }
                }

                ArrayList<Integer> vencedores = new ArrayList<Integer>();
                int melhorPontuacao = -1;
                
                for(int i = 1; i <= p; i++){
                    if(melhorPontuacao == placar[i]){
                        vencedores.add(i);
                    }else if(melhorPontuacao < placar[i]){
                        vencedores.clear();
                        melhorPontuacao = placar[i];
                        vencedores.add(i);
                    }
                }
                sb.append(vencedores.get(0));
                for(int i = 1; i < vencedores.size(); i++){
                    sb.append(" ").append(vencedores.get(i));
                }
                sb.append("\n");
            }

        } while (g != 0 && p != 0);
        System.out.print(sb.toString());
    }
}
