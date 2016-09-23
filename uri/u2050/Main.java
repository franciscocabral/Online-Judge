/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u2050;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> pessoas = new ArrayList<String>();

        int r = s.nextInt();
        int z = 0;
        while (r != -1) {
            pessoas.clear();
            pessoas.add(s.next());
            pessoas.add(s.next());
            pessoas.add(s.next());
            pessoas.add(s.next());
            pessoas.add(s.next());
            pessoas.add(s.next());
            Collections.sort(pessoas);

            boolean[][] amigos = new boolean[6][6];
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    amigos[i][j] = false;
                }
            }

            for (int i = 0; i < r; i++) {
                int p1 = pessoas.indexOf(s.next());
                int p2 = pessoas.indexOf(s.next());
                amigos[p1][p2] = true;
                amigos[p2][p1] = true;
            }
            z++;
            System.out.println("Instancia " + z);
            for (int i = 0; i < 4; i++) {
                for (int j = i + 1; j < 5; j++) {
                    for (int k = j + 1; k < 6; k++) {
                        if (amigos[i][j] && amigos[j][k] && amigos[k][i]) {
                            System.out.println(pessoas.get(i) + " " + pessoas.get(j) + " " + pessoas.get(k) + " sao amigos");
                        }
                        if (!amigos[i][j] && !amigos[j][k] && !amigos[k][i]) {
                            System.out.println(pessoas.get(i) + " " + pessoas.get(j) + " " + pessoas.get(k) + " sao inimigos");
                        }
                    }
                }
            }
            r = s.nextInt();
            if(r!=-1)System.out.println("");
        }
    }
}
