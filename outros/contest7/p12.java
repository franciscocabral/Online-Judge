/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest7;

public class p12 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int a, b, c, d;
        int w = 8000000;
        for (a = 6; a <= 200; a++) {
            for (b = 2; b < a; b++) {
                if (b * b * b * 3 > w) {
                    break;
                }
                for (c = b; c < a; c++) {

                    if ((c * c * c * 2) > w - (b * b * b)) {
                        break;
                    }
                    int x = b * b * b;
                    int y = c * c * c;
                    int z = a * a * a;
                    if (z - x - y > 0) {
                        double temp = Math.cbrt(z - x - y);
                        d = (int) temp;
                        if (d * d * d == z - x - y) {
                            if (d > c) {
                                sb.append("Cube = ").append(a).append(", Triple = (").append(b).append(",").append(c).append(",").append(d).append(")\n");
                                        
                            }
                        }
                    }
                }
            }
        }
        System.out.print(sb.toString());
    }
}
