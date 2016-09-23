package p6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int solve(ArrayList<Integer> numbers, int d, int m) {

        int tot = 0;
        for (int i = 0; i < numbers.size(); i++) {

            ArrayList<Integer> tmp = (ArrayList<Integer>) numbers.clone();
            int remocoesRestantes = m;
            while (remocoesRestantes > 0) {
                int sum = numbers.get(i);
                tmp.remove(i);
                for (int j = i; j < tmp.size(); j++) {
                    sum += tmp.get(j);
                }
                remocoesRestantes--;
            }
        }

        return tot;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int q = s.nextInt();
        int zz = 1;
        while (n != 0) {
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                numbers.add(s.nextInt());
            }

            sb.append("SET ").append(zz).append(":\n");
            for (int i = 0; i < q; i++) {
                int d = s.nextInt();
                int m = s.nextInt();
                sb.append("QUERY ").append(i + 1).append(": ").append(solve(numbers, d, m)).append("\n");
            }
            n = s.nextInt();
            q = s.nextInt();
            zz++;
        }

        System.out.print(sb);

    }

}
