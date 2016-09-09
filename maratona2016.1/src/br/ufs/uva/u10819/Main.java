/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufs.uva.u10819;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (s.hasNext()) {
            int qtd = s.nextInt();
            int itens = s.nextInt();

            int[] preco = new int[itens];
            int[] favour = new int[itens];

            for (int i = 0; i < itens; i++) {
                int x = s.nextInt();
                int y = s.nextInt();
                preco[i] = x;
                favour[i] = y;
            }

            int qtd200 = (qtd > 1800) ? qtd + 200 : qtd;

            Integer[] todosPrecos = new Integer[qtd200 + 1];
            Arrays.fill(todosPrecos, 0);

            int maiorFlavor = 0;
            for (int i = 0; i < itens; i++) {
                for (int j = qtd200; j >= preco[i]; j--) {
                    if (todosPrecos[j - preco[i]] > 0 || j == preco[i]) {
                        todosPrecos[j] = Math.max(todosPrecos[j - preco[i]] + favour[i], todosPrecos[j]);
                        maiorFlavor = Math.max(maiorFlavor, todosPrecos[j]);
                    }
                }
            }

            if (qtd200 >= 1801 && qtd <= 2000) {
                maiorFlavor = 0;
                for (int j = qtd200; j >= 0; j++) {
                    maiorFlavor = Math.max(maiorFlavor, todosPrecos[j]);
                    if(j == 2001 && maiorFlavor > 0) break;
                } 
            }

            sb.append(maiorFlavor).append("\n");
            //System.out.println(maiorFlavor);
        }
        System.out.print(sb);
    }

}
