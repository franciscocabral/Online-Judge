package uva.u948;

import java.util.Scanner;

public class Main {

    public static int[] fib = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986};

    public static String fibase(int number) {
        int x = number;
        char[] tmp = new char[fib.length];
        int max = fib.length - 1;
        boolean isZero = false;
        for (int i = max; i > 0; i--) {
            if (x >= fib[i]) {
                x -= fib[i];
                tmp[max - i] = '1';
                isZero = true;
            } else if (isZero) {
                tmp[max - i] = '0';
            } else {
                tmp[max - i] = ' ';
            }
        }
        return String.copyValueOf(tmp).trim();

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            int x = s.nextInt();
            System.out.println(x + " = " + fibase(x) + " (fib)");

        }
    }

}
