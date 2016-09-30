/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u11089;

import java.util.Scanner;
import java.lang.StringBuilder;

public class Main {

    public static int[] fib = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233,
        377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368,
        75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309,
        3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986,
        102334155, 165580141, 267914296, 433494437, 701408733, 1134903170};

    public static String fibinary(int number) {
        int x = number;
        StringBuilder sb = new StringBuilder();
        boolean isZero = false;
        for (int i = 44; i > 0; i--) {
            if (fib[i] <= x) {
                sb.append("1");
                x -= fib[i];
                isZero = true;
            } else if (isZero) {
                sb.append("0");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            int x = s.nextInt();
            System.out.println(fibinary(x));

        }
    }
}
