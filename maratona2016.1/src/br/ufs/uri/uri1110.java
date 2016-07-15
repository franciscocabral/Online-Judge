/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufs.uri;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner s = new Scanner(System.in);
        int n;

        do{
            n = s.nextInt();
            if(n == 0 )break;
            Queue<Integer> cards = new LinkedList<Integer>() {};
            for(int i = 1; i <= n; i++){
                cards.add(i);
            }
            sb.append("Discarded cards: ");
            while(cards.size() > 1){
                sb.append(cards.remove());
                if(cards.size() >= 2){
                    sb.append(", ");
                }
                cards.add(cards.remove());
            }
            int lastCard = cards.remove();
            sb.append("\nRemaining card: ").append(lastCard).append("\n");
        }while(n != 0);
        System.out.print(sb.toString());
    }
}
