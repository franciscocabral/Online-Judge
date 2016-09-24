/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

import java.util.Scanner;

public class p6 {
    public static int[] normalize(String trecho){
        String[] notas = trecho.split(" ");
        int[] result = new int[notas.length];
        int i = 0;
        for(String nota : notas){
            result[i++] = norm(nota);
        }
        return result;  
    }
    
    public static int desceTom(int nota, int tons){
        int result = nota -tons;
        
        if(result == -1) result = 11;
        else if(result == 12) result = 0;
        
        return result;
    }
    
    public static int sobeTom(int nota, int tons){
        int result = nota +tons;
        
        if(result == -1) result = 11;
        else if(result == 12) result = 0;
        
        return result;
    }
    
    public static int norm(String nota){
        int result = 0;
        switch(nota.charAt(0)){
            case 'A': result = 0; break;
            case 'B': result = 2; break;
            case 'C': result = 3; break;
            case 'D': result = 5; break;
            case 'E': result = 7; break;
            case 'F': result = 8; break;
            case 'G': result = 10; break;
        }
        
        if(nota.charAt(1) == 'b') result = desceTom(result, 1);
        else if(nota.charAt(1) == '#') result = sobeTom(result, 1);

        return result;  
    }
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        s.nextLine();
        while(m != 0 && n != 0){
            s.nextLine();
            String musicaS = s.nextLine();
            String trechoS = s.nextLine();
            int[] musica = normalize(musicaS);
            int[] trecho = normalize(trechoS);
            
            int trechoD = trecho[0];
            int[] trechoDelta = trecho;
            for(int i = 0; i < trechoDelta.length; i++){
                trechoDelta[i] = desceTom(trechoDelta[i], trechoD);
            }
            
            for(int j = 0; j< 12; j++){
                int[] musicaDelta = musica;
                for(int i = 0; i < musicaDelta.length; i++){
                    musicaDelta[i] = desceTom(musicaDelta[i], j);
                }
            }
            
            
            n = s.nextInt();
            m = s.nextInt();
        }
    }
}
