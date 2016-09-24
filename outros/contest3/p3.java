/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest3;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Fancisco
 */
public class p3 {

    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int[][] m;

        for (int n = 0; n < t; n++) {

            m = new int[4][4];
            boolean down = false;
            boolean left = false;
            boolean right = false;
            boolean up = false;
            boolean none = false;

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    m[i][j] = s.nextInt();
                }
            }
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (m[i][j] == 2048) {
                        none = true;
                    }

                    if (j - 1 >= 0) {
                        if (m[i][j - 1] == 0 && m[i][j] != 0) {
                            left = true;
                        }
                        if (m[i][j - 1] == m[i][j] && m[i][j] != 0) {
                            left = true;
                            right = true;
                        }
                    }

                    if (j + 1 <= 3) {
                        if (m[i][j + 1] == 0  && m[i][j] != 0) {
                            right = true;
                        }
                    }

                    if (i - 1 >= 0) {
                        if (m[i - 1][j] == 0  && m[i][j] != 0) {
                            up = true;
                        }
                        if (m[i - 1][j] == m[i][j] && m[i][j] != 0) {
                            up = true;
                            down = true;
                        }
                    }

                    if (i + 1 <= 3) {
                        if (m[i + 1][j] == 0 && m[i][j] != 0) {
                            down = true;
                        }
                    }
                }
            }
            String resp = "";
            if (down && !none) {
                resp += "DOWN";
            }
            if (down && (left || right || up) && !none) {
                resp += " ";
            }
            if (left && !none) {
                resp += "LEFT";
            }
            if (left && (right || up) && !none) {
                resp += " ";
            }
            if (right && !none) {
                resp += "RIGHT";
            }
            if (right && up && !none) {
                resp += " ";
            }
            if (up && !none) {
                resp += "UP";
            }
            if ((!down && !up && !left && !right) || none) {
                resp = "NONE";
            }
            System.out.println(resp);
        }

    }
}
