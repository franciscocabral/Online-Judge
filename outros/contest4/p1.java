/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest4;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class p1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n;
        String line;

        do {
            n = s.nextInt();
            if (n == 0) {
                break;
            }
            line = s.next();

            int tot = 0;
            StringBuilder resp = new StringBuilder("");
            StringBuilder tmp = new StringBuilder("");
            int max = line.length() / n;
            for (int i = 0; i < line.length(); i++) {
                if (tot == 0) {
                    tmp = new StringBuilder("");
                }

                if (tot < max) {
                    tmp.append(line.charAt(i));
                    tot++;
                }
                if (tot == max) {
                    tmp.reverse();
                    resp.append(tmp.toString());
                    tot = 0;
                }

            }
            System.out.println(resp.toString());

        } while (n != 0);

    }
}
