/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest7;

import java.util.Scanner;

public class p8 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        while (n > 0) {
            n--;
            int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
            int x, y, z;
            boolean achou = false;
            for (x = -22; x <= 22 && !achou; x++) {
                if (x * x <= c) {
                    for (y = -100; y <= 100 && !achou; y++) {
                        if (y != x && x * x + y * y <= c) {
                            for (z = -100; z <= 100 && !achou; z++) {
                                if (z != x && z != y
                                    && x + y + z == a
                                    && x * y * z == b
                                    && x * x + y * y + z * z == c) {
                                    sb.append(x).append(" ").append(y).append(" ").append(z).append("\n");
                                    achou = true;
                                }
                            }
                        }
                    }
                }
            }
            if(!achou)
                sb.append("No solution.\n");

        }
        System.out.print(sb.toString());
    }
}
