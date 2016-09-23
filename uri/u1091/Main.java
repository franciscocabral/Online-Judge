/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u1091;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int n = s.nextInt();
        while (n > 0) {
            
            int inicialX = s.nextInt();
            int inicialY = s.nextInt();
            for(int i = 0; i < n; i++){
                int x = s.nextInt();
                int y = s.nextInt();
                
                if(x == inicialX || y == inicialY)
                    sb.append("divisa\n");
                else if(x > inicialX && y > inicialY)
                    sb.append("NE\n");
                else if(x < inicialX && y > inicialY)
                    sb.append("NO\n");
                else if(x > inicialX && y < inicialY)
                    sb.append("SE\n");
                else if(x < inicialX && y < inicialY)
                    sb.append("SO\n");
            }
            n = s.nextInt();
        }
        System.out.print(sb);
    }
}
