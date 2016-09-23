/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u1595;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author kiko5
 */
public class Main {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = S.nextInt();

        for (int i = 0; i < n; i++) {
            double resultado = 0.0;
            ArrayList<Integer> array = new ArrayList<Integer>();

            int s = S.nextInt();
            int c = S.nextInt();
            double r = S.nextDouble();

            for (int j = 0; j < s; j++) {
                array.add(S.nextInt());
            }
            Collections.sort(array);
            for (int j = 0; j < c; j++) {
                resultado += 1.0 / ((array.get(j) * 1.0 + r * 1.0));
            }
            for (int j = c; j < s; j++) {
                resultado += 1.0 / (array.get(j) * 1.0);
            }
            sb.append(String.format("%.2f", resultado)).append("\n");
        }

        System.out.print(sb.toString());
    }

}
