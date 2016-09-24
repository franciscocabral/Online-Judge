/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Fancisco
 */
public class p1 {
    
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String linha;
        
        while ((linha = in.readLine()) != null) { //NOT EOF
            char[] cpf = linha.toCharArray();
            int b1 = (Integer.parseInt(""+cpf[0])*1 + Integer.parseInt(""+cpf[1])*2 + Integer.parseInt(""+cpf[2])*3 + Integer.parseInt(""+cpf[4])*4 + Integer.parseInt(""+cpf[5])*5 + Integer.parseInt(""+cpf[6])*6 + Integer.parseInt(""+cpf[8])*7 + Integer.parseInt(""+cpf[9])*8+ Integer.parseInt(""+cpf[10])*9) % 11;
            b1 = b1 == 10? 0 :b1;
            
            int b2 = (Integer.parseInt(""+cpf[0])*9 + Integer.parseInt(""+cpf[1])*8 + Integer.parseInt(""+cpf[2])*7 + Integer.parseInt(""+cpf[4])*6 + Integer.parseInt(""+cpf[5])*5 + Integer.parseInt(""+cpf[6])*4 + Integer.parseInt(""+cpf[8])*3 + Integer.parseInt(""+cpf[9])*2+ Integer.parseInt(""+cpf[10])*1) % 11;
            b2 = b2 == 10? 0 :b2;
            if(Integer.parseInt(""+cpf[12]) == b1 && Integer.parseInt(""+cpf[13]) == b2){
                System.out.println("CPF valido");
            }else{
                System.out.println("CPF invalido");
            }
        
        }
        
    }
}
