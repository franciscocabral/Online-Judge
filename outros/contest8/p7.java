/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest8;

import java.util.ArrayList;
import java.util.Scanner;

class p7 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = s.nextInt();

        for (int z = 0; z < n; z++) {
            int nPaineis = s.nextInt();
            int caminhoes = s.nextInt();
            int frete = s.nextInt();
            ArrayList<Integer> peso = new ArrayList<Integer>();

            int maior = -1;
            int total = 0;
            for (int zz = 0; zz < nPaineis; zz++) {
                int tmp = s.nextInt();
                peso.add(tmp);
                if (tmp > maior) {
                    maior = tmp;
                }
                total += tmp;
            }

            int inicio = maior;
            int fim = total;
            while (inicio < fim) {
                int meio = inicio + (fim - inicio) / 2;

                int atual = 0;
                int peso_atual = 0;
                for (int i = 0; i < peso.size(); i++) {
                    if (peso_atual + peso.get(i) <= meio) {
                        peso_atual += peso.get(i);
                    } else {
                        peso_atual = peso.get(i);
                        atual++;
                    }
                }

                if (atual < caminhoes) {
                    fim = meio;
                } else {
                    inicio = meio + 1;
                }
            }

            sb.append(inicio).append(" $").append(inicio * caminhoes * frete).append('\n');

        }
        System.out.print(sb);
    }
}
