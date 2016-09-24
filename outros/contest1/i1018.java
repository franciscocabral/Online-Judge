/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest1;

import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class i1018 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int money = s.nextInt();
        int cedulas[] = {100,50,20,10,5,2,1};
        System.out.println(money);
        for (int i = 0; i < 7; i++) {
            int qtde = (money / cedulas[i]);
            System.out.println(qtde+" nota(s) de R$ "+cedulas[i]+",00");
            money = money - qtde*cedulas[i];
        }
    }
}
