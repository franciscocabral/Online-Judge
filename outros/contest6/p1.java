/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest6;

import java.io.IOException;
import java.util.Scanner;

public class p1 {
    public static boolean verde(int momento, int sinal){
        return (momento % sinal >= sinal -5);
    }
    
    public static void main(String[] args) throws IOException {
        
        Scanner s = new Scanner(System.in);
        String line;
        int set = 1;
        while (s.hasNext()) {
            line = s.nextLine();
            String[] tmp = line.split(" ");
            
            int[] sinais = new int[tmp.length];
            int menorSinal = Integer.MAX_VALUE;
            int i = 0;
            for(String t : tmp){
                sinais[i] = Integer.parseInt(t);
                menorSinal = menorSinal > sinais[i] ? sinais[i] : menorSinal;
                i++;
            }
            
            int tempoAtual = menorSinal+1;
            
            boolean found = true;
            while( tempoAtual <= 3600){
                found = true;
                for(i = 0; i < sinais.length; i++){
                    if(!verde(tempoAtual, sinais[i])) {
                        found = false;
                        break;
                    }
                }
                if(found) break;
                tempoAtual++;
            }
            int minutos = tempoAtual / 60;
            int segundos = tempoAtual % 60;
            
            if(found){
                System.out.println("Set "+set+" synchs again at "+minutos+" minute(s) and "+segundos+" second(s) after all turning green.");
            }else{
                System.out.println("Set "+set+" is unable to synch after one hour.");
            }
            
            set++;
        }
    }
}
