/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest4;

import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author aluno
 */
public class p4 {

    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("");
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        
        for(int i=0; i<n; i++){
            int m = s.nextInt();
            Vector<Integer> alunos = new Vector<Integer>(m);
            Vector<Integer> ordenados = new Vector<Integer>(m);
            
            for(int j = 0; j < m; j++){
                alunos.add(s.nextInt());
            }
            ordenados = (Vector<Integer>) alunos.clone();
            
            Collections.sort(ordenados, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });
            
            int equals = 0;
            for(int j = 0; j < m; j++){
                if(Objects.equals(alunos.get(j), ordenados.get(j))) {
                    equals++;
                }
            }
            sb.append(equals).append("\n");
        }
        System.out.print(sb.toString());
    }
}
