/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u1084;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        char[] pilha = new char[100001];

        int n = s.nextInt();
        int d = s.nextInt();
        while (d != 0) {
            String num = s.next();
            
            int maior = -1;
            for(int i = 0; i < n; i++){
                char atual = num.charAt(i);
                while(d > 0 && maior != -1 && pilha[maior] < atual){
                    maior--;
                    d--;
                }
                maior++;
                pilha[maior] = atual;
            }
            maior = maior - d;
            for(int i = 0; i<= maior; i++) 
                sb.append(pilha[i]);
            sb.append("\n");
            n = s.nextInt();
            d = s.nextInt();
        }
        System.out.print(sb.toString());
    }
}
