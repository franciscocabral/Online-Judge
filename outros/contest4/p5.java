/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest4;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class p5 {

    public static class infos {
        public infos(String name, int base, int size, int dimension, int[][] bounds) {
            this.name = name;
            this.base = base;
            this.size = size;
            this.dimension = dimension;
            this.bounds = bounds;
            
            this.c = new int[dimension+1];
            this.c[dimension] = size;
            
            for(int i = dimension -1; i > 0; i--){
                this.c[i] = this.c[i+1] * (bounds[i][1] - bounds[i][0] + 1);
            }
            
            this.c[0] = base;
            
            for(int i = 1; i <= dimension; i++){
                this.c[0] -= this.c[i] * bounds[i-1][0];
            }
        }

        public String name;
        public int base;
        public int size;
        public int dimension;
        public int[][] bounds;
        public int[] c;

        public int calc(int[] ref) {
            int ctotal = this.c[0];
            for(int i = 0; i < ref.length; i++){
                ctotal += this.c[i+1] * ref[i];
            }
            return ctotal;
        }
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = s.nextInt();

        HashMap<String, infos> hash = new HashMap<String, infos>();

        for (int i = 0; i < n; i++) {
            String name = s.next();
            int b = s.nextInt();
            int size = s.nextInt();
            int d = s.nextInt();
            int[][] bounds = new int[d][2];
            for (int j = 0; j < d; j++) {
                bounds[j][0] = s.nextInt();
                bounds[j][1] = s.nextInt();
            }

            infos tmp = new infos(name, b, size, d, bounds);
            hash.put(name, tmp);
        }

        for (int i = 0; i < r; i++) {
            String name = s.next();
            infos tmp = hash.get(name);
            sb.append(name).append("[");
            
            int[] ref = new int[tmp.dimension];
            for (int j = 0; j <= tmp.dimension - 2; j++) {
                ref[j] = s.nextInt();
                sb.append(ref[j]).append(", ");
            }
            ref[tmp.dimension - 1] = s.nextInt();
            sb.append(ref[tmp.dimension - 1]);

            sb.append("] = ").append(tmp.calc(ref)).append("\n");

        }
        System.out.print(sb.toString());
               
    }
}
