/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest2;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class p11 {
    public static class dot{
        public int x = -1;
        public int y = -1;

        public boolean isEmpty() {
            return x == -1 && y == -1;
        }
//        @Override
//        public String toString(){
//            return "{"+x+", "+y+"}";
//        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        long startTime = System.nanoTime();
        int z = 0;
        int m;
        int n;
        int[][] matrix;
        dot[] initials;
        dot[] finals;
        int q;
        int low;
        int high;
        StringBuffer resp = new StringBuffer();
        
        while (true) {
            m = s.nextInt();
            n = s.nextInt();
            if (m == 0 && n == 0) {
                break;
            }

            matrix = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = s.nextInt();
                }
            }
            q = s.nextInt();
            for (int k = 0; k < q; k++) {
                low = s.nextInt();
                high = s.nextInt();

                int maxFound = 0;
                
                initials = new dot[n];
                finals = new dot[n];
                
                for(int j = 0; j < n; j++){
                    initials[j] = new dot();
                    finals[j] = new dot();
                    for(int i = 0; i < m; i++){
//                        z++;
                        if(matrix[i][j] >= low && initials[j].isEmpty()){
                            initials[j].x = i;
                            initials[j].y = j;
                            break;
                        }
                    }
                    for(int i = m-1; i >= 0; i--){
//                        z++;
                        if(matrix[i][j] <= high && finals[j].isEmpty()){
                            finals[j].x = i;
                            finals[j].y = j;
                            break;
                        }
                    }
                }
                
                for(int i = 0; i<n; i++){
                    if(initials[i].isEmpty())continue;
                    for(int j = i+maxFound; j<n; j++){
//                        z++;
                        if(finals[j].isEmpty()) continue;
                        int tmpx = (finals[j].x - initials[i].x);
                        int tmpy = (finals[j].y - initials[i].y);
                        if(tmpx == tmpy)
                            if(maxFound < tmpx+1){
                                maxFound = tmpx+1;
                                break;
                            }
                    }
                }
                
//                int M = m;
//                int N = n;
//                int lastPossibleI = M;
//                int lastPossibleJ = N;
//                
//                
//                for (int i = 0; i < M; i++) {
//                    int ai = i;
//                    for (int j = 0; j < N; j++) {
//                        int aj = j;
//                        int found = 0;  
//                        while(true){
//                            if(ai >= lastPossibleI && aj >= lastPossibleJ) break;
//                            if(ai >= M || aj >= N) break;
//                            if(matrix[ai][aj] >= low){
//                                if(matrix[ai][aj] > high) break;
//                                ai++;
//                                aj++;
//                                found++;
//                            }else if(matrix[ai][aj] > high){
//                                lastPossibleI = ai;
//                                lastPossibleJ = aj;
//                            }else{
//                                break;
//                            }
//                            z++;
//                        }
//                        if(maxFound < found) maxFound = found;
//                        if(aj+maxFound > n) break;
//                    } 
//                    if(ai+maxFound > m) break;
//                }
                resp.append(maxFound).append("\n");
            }
            resp.append("-\n");
        }
        System.out.println(resp);
//        long endTime = System.nanoTime();
//        System.out.println(z + " "+(endTime - startTime) / 1000000000.0);
    }
}

