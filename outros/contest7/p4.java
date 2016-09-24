/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest7;

import java.util.Scanner;

public class p4 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner s = new Scanner(System.in);

        while (s.hasNext()) {
            int marrom[] = new int[3];
            int verde[] = new int[3];
            int transparente[] = new int[3];
            marrom[0] = s.nextInt();
            marrom[1] = s.nextInt();
            marrom[2] = s.nextInt();
            verde[0] = s.nextInt();
            verde[1] = s.nextInt();
            verde[2] = s.nextInt();
            transparente[0] = s.nextInt();
            transparente[1] = s.nextInt();
            transparente[2] = s.nextInt();

            int minimoNecessario = Integer.MAX_VALUE;
            String lixeiras = "";
            int temp;

            temp = transparente[0] + marrom[0] + marrom[1] + verde[1] + verde[2] + transparente[2];
            if (temp <= minimoNecessario) {
                minimoNecessario = temp;
                lixeiras = "GCB";
            }
            temp = transparente[0] + marrom[0] + transparente[1] + verde[1] + marrom[2] + verde[2];
            if (temp <= minimoNecessario) {
                minimoNecessario = temp;
                lixeiras = "GBC";
            }
            temp = marrom[0] + verde[0] + marrom[1] + transparente[1] + verde[2] + transparente[2];
            if (temp <= minimoNecessario) {
                minimoNecessario = temp;
                lixeiras = "CGB";
            }
            temp = marrom[0] + verde[0] + transparente[1] + verde[1] + marrom[2] + transparente[2];
            if (temp <= minimoNecessario) {
                minimoNecessario = temp;
                lixeiras = "CBG";
            }
            temp = transparente[0] + verde[0] + marrom[1] + transparente[1] + marrom[2] + verde[2];
            if (temp <= minimoNecessario) {
                minimoNecessario = temp;
                lixeiras = "BGC";
            }
            temp = transparente[0] + verde[0] + marrom[1] + verde[1] + marrom[2] + transparente[2];
            if (temp <= minimoNecessario) {
                minimoNecessario = temp;
                lixeiras = "BCG";
            }
            sb.append(lixeiras).append(" ").append(minimoNecessario).append("\n");
        }
        System.out.print(sb.toString());
    }
}
