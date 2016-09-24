/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class p2 {

    static class contestant implements Comparable<contestant> {

        public contestant(int c, int p, int t, char l) {
            this.id = c;
            this.add(p, t, l);
        }

        public int id;
        public int[] erros = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        public int[] tempos = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        public int corretas = 0;
        public int tempoTotal = 0;

        public void add(int p, int t, char l) {
            if (l == 'C') {
                this.acertou(p, t);
            } else if (l == 'I') {
                this.errou(p);
            }
        }

        public void errou(int p) {
            this.erros[p]++;
        }

        public void acertou(int p, int t) {
            if (tempos[p] == 0) {
                this.tempos[p] = t;
                tempoTotal += (erros[p] * 20) + tempos[p];
                corretas++;
            }
        }

        @Override
        public String toString() {
            return id + " " + corretas + " " + tempoTotal;
        }

        @Override
        public int compareTo(contestant o) {
            if (this.corretas < o.corretas) {
                return 1;
            } else if (this.corretas > o.corretas) {
                return -1;
            } else {
                if (this.tempoTotal > o.tempoTotal) {
                    return 1;
                } else if (this.tempoTotal < o.tempoTotal) {
                    return -1;
                } else {
                    return this.id - o.id;
                }
            }
        }
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        s.nextLine();

        for (int i = 0; i < n; i++) {
            String line = s.nextLine();
            HashMap<Integer, contestant> contestants = new HashMap<Integer, contestant>();
            ArrayList<contestant> contestantOrder = new ArrayList<contestant>();
            while (!line.equals("")) {
                String[] parts = line.split(" ");
                int c = Integer.parseInt(parts[0]);
                int p = Integer.parseInt(parts[1]);
                int t = Integer.parseInt(parts[2]);
                char l = parts[3].charAt(0);

                contestant con = contestants.get(c);
                if (con == null) {
                    con = new contestant(c, p, t, l);
                    contestants.put(c, con);
                    contestantOrder.add(con);
                } else {
                    con.add(p, t, l);
                }

                line = s.nextLine();
            }
//            contestantOrder.sort(new Comparator<contestant>() {
//                @Override
//                public int compare(contestant o1, contestant o2) {
//                    return o1.compareTo(o2);
//                }
//            });

            for (contestant con : contestantOrder) {
                sb.append(con.toString()).append("\n");
            }
            sb.append("\n");

        }
        System.out.print(sb.toString());
    }
}
