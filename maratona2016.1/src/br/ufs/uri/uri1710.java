/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufs.uri;

import java.util.ArrayList;
import java.util.Scanner;

public class uri1710 {
    public static void main() {
        Scanner s = new Scanner(System.in);
        
        int m = s.nextInt();
        int n = s.nextInt();
        
        int max = 0;
        
        ArrayList<Plano> planos = new ArrayList<Plano>();
        
        int i;
        for(i = 0; i < m; i++){
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            int d = s.nextInt();
            planos.add(new Plano(a,b,c,d));
        }
        Plano maiorPlano = null;
        for(i = 0; i < n; i++){
            int j;
            int x = s.nextInt();
            int y = s.nextInt();
            int z = s.nextInt();
            for(j = 0; j < m; j++){
                Plano p = planos.get(i);
                if(p.isInPlano(x, y, z)){
                    if(maiorPlano == null || maiorPlano.mundos < p.mundos) {
                        maiorPlano = p;
                    }
                    break;
                }
            }
        }
        
        System.out.println(maiorPlano.mundos);
    }
}


class Plano{
    public int a, b, c, d;
    public int mundos = 0;

    Plano(int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public boolean isInPlano(int x, int y, int z){
        if(x*a + y*b + z*c == d){
            mundos++;
            return true;
        }
        return false;
    }
}