/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u357;

import java.util.Scanner;

public class Main {

    public static long[] ways = new long[30001];
    public static int[] moedas = {1,5, 10, 25, 50};

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        ways[0] = 1;
        for (int i = 0; i < 5; ++i) {
            for (int j = moedas[i]; j < 30001; ++j) {
                ways[j] += ways[j - moedas[i]];
            }
        }
        while (s.hasNext()) {
            int x = s.nextInt();
            if (ways[x] > 1) {
                sb.append("There are ").append(ways[x]).append(" ways to produce ").append(x).append(" cents change.\n");
            } else {
                sb.append("There is only ").append(ways[x]).append(" way to produce ").append(x).append(" cents change.\n");
            }
        }
        System.out.print(sb);
    }

}
