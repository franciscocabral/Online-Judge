/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest2;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class p8 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, d;

        do {
            a = s.nextInt();
            d = s.nextInt();
            if (a == 0 && d == 0) {
                break;
            }

            int mA = 0, mD1 = 0, mD2 = 0;
            for (int i = 0; i < a; i++) {
                int b = s.nextInt();
                if (i == 0) {
                    mA = b;
                } else if (b < mA) {
                    mA = b;
                }
            }

            for (int i = 0; i < d; i++) {
                int c = s.nextInt();
                if (i == 0) {
                    mD1 = c;
                } else if (i == 1) {
                    if (c < mD1) {
                        mD2 = mD1;
                        mD1 = c;
                    } else {
                        mD2 = c;
                    }
                } else if (c < mD2) {
                    if (c < mD1) {
                        mD2 = mD1;
                        mD1 = c;
                    } else {
                        mD2 = c;
                    }
                }
            }
            if (mA >= mD2) {
                System.out.println("N");
            } else {
                System.out.println("Y");
            }

        } while (true);

    }
}
