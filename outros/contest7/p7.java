package contest7;

import java.util.Scanner;

public class p7 {

    public static boolean temTodosDistintos(int i) {
        int a, b, c, d, e;
        e = i % 10;
        d = (int) (i * 0.1) % 10;
        c = (int) (i * 0.01) % 10;
        b = (int) (i * 0.001) % 10;
        a = (int) (i * 0.0001) % 10;
        if (a != b && a != c && a != d && a != e
                && b != c && b != d && b != e
                && c != d && c != e
                && d != e) {
            return true;
        }
        return false;
    }

    public static boolean distintos(int x, int y) {

        int a1, b1, c1, d1, e1;
        e1 = x % 10;
        d1 = (int) (x * 0.1) % 10;
        c1 = (int) (x * 0.01) % 10;
        b1 = (int) (x * 0.001) % 10;
        a1 = (int) (x * 0.0001) % 10;

        int a2, b2, c2, d2, e2;
        e2 = y % 10;
        d2 = (int) (y * 0.1) % 10;
        c2 = (int) (y * 0.01) % 10;
        b2 = (int) (y * 0.001) % 10;
        a2 = (int) (y * 0.0001) % 10;
        if (a1 != a2 && a1 != b2 && a1 != c2 && a1 != d2 && a1 != e2
                && b1 != a2 && b1 != b2 && b1 != c2 && b1 != d2 && b1 != e2
                && c1 != a2 && c1 != b2 && c1 != c2 && c1 != d2 && c1 != e2
                && d1 != a2 && d1 != b2 && d1 != c2 && d1 != d2 && d1 != e2
                && e1 != a2 && e1 != b2 && e1 != c2 && e1 != d2 && e1 != e2) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n != 0) {
            boolean achou = false;
            for (int y = 01234; y < 98765; y++) {
                if (temTodosDistintos(y)) {
                    int x = n * y;
                    if (x > 98765) {
                        break;
                    }
                    if (temTodosDistintos(x)) {
                        if (distintos(x, y)) {
                            System.out.printf("%05d / %05d = %d\n", x,y,n);
                            achou = true;
                        }
                    }
                }
            }
            if(!achou){
                System.out.println("There are no solutions for "+n+".");
            }
            n = s.nextInt();
            if(n != 0){ 
                System.out.println("");
            }
        }

    }
}
