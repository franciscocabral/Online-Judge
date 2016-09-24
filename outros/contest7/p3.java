/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest7;

/**
 *
 * @author Fancisco
 */
public class p3 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        // a+b+c+d = x
        // abcd = x
        //Dica: https://www.wolframalpha.com/input/?i=a+%2B+b+%2B+c+%2B+d+%3D+a+*+b+*+c+*+d
        for (int a = 1; 4 * a <= 2000; a++) {
            for (int b = a; (3 * b) + a <= 2000; b++) {
                for (int c = b; (2 * c) + (a + b) <= 2000; c++) {
                    int d;
                    int soma = (a + b + c);
                    int produto = (a * b * c);
                    if (produto > 1000000) {
                        d = soma * 1000000 / (produto - 1000000);
                        if (d >= c && soma + d <= 2000 && ((soma + d) * 1000000) == ((produto * d))) {
                            sb.append(String.format(java.util.Locale.US,
                                "%.2f %.2f %.2f %.2f",
                                (float) a / 100, (float) b / 100, (float) c / 100, (float) d / 100)).append("\n");
                        }
                    }
                }
            }
        }
        System.out.print(sb.toString());
    }
}
