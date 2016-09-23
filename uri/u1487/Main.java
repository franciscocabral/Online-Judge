/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u1487;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = s.nextInt();
        int tempo = s.nextInt();
        int zzz = 1;
        int[][] brinquedos = new int[101][601];
        while (n != 0) {
            int[] tempos = new int[101];
            int[] pontos = new int[101];
            for (int i = 0; i < n; i++) {
                tempos[i] = s.nextInt();
                pontos[i] = s.nextInt();
            }

            for (int i = 1; i <= tempo; i++) {
                brinquedos[0][i] = 0;
                for (int j = 1; j <= n; j++) {
                    if (i - tempos[j] < 0) {
                        brinquedos[j][i] = brinquedos[j - 1][i];
                    } else {
                        brinquedos[j][i] = Math.max(brinquedos[j - 1][i], brinquedos[j - 1][i - tempos[j]] + pontos[j]);
                        brinquedos[j][i] = Math.max(brinquedos[j][i], brinquedos[j][i - tempos[j]] + pontos[j]);
                    }
                }
            }
            sb.append("Instancia ").append(zzz).append("\n").append(brinquedos[n][tempo]).append("\n\n");

            n = s.nextInt();
            tempo = s.nextInt();
            zzz++;
        }

        System.out.print(sb);
    }

}
