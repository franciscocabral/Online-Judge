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
public class i1435 {
    public static void print(int n){
        if(n < 10)
            System.out.print("  "+n);
        else if(n >= 10 && n < 100)
            System.out.print(" "+n);
        else if(n >= 10 && n < 100)
            System.out.print(n);
    }
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        while(true){
            int n = s.nextInt();
            int num = 1;
            if(n == 0) break;
            else if(n == 1) System.out.println(num);
            else {
                for(int i = 1; i<=n; i++){
                    for(int j = 1; j<=n-1; j++){
                        if(i <= n/2)
                            num = i;
                        else
                            num = n - (i-1);
                        
                        print(num);
                        System.out.print(" ");
                    }
                    print(num);
                    System.out.println("");
                }
            }
            System.out.println("");
                
        }
        
        
    }
}