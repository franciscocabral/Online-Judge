/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Fancisco
 */
public class p4 {

    public static class Floor implements Comparable<Floor> {

        private boolean color;
        private int value;

        public boolean isRed() {
            return color == true;
        }

        public boolean isBlue() {
            return color == false;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.color = (value >= 0);
            this.value = value >= 0 ? value : (value * -1);
        }

        public String toString() {
            return "{" + value + ", " + (isRed() ? "RED" : "BLUE") + "}";
        }

        @Override
        public int compareTo(Floor o) {
            if (this.getValue() > o.getValue()) {
                return -1;
            } else if (this.getValue() < o.getValue()) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
        int p = s.nextInt();
        List<Floor> andares;

        for (int caso = 0; caso < p; caso++) {
            int n = s.nextInt();
            andares = new ArrayList<Floor>();
            for (int andar = 0; andar < n; andar++) {
                Floor f = new Floor();
                f.setValue(s.nextInt());
                andares.add(f);
            }

            Collections.sort(andares, new Comparator<Floor>() {
                @Override
                public int compare(Floor o1, Floor o2) {
                    return o1.compareTo(o2);
                }
            });

            Floor last = null;
            int total = 0;
            for (Floor next : andares) {
                if (last != null) {
                    if (last.isBlue() == next.isRed()) {
                        total++;
                    }
                } else {
                    total++;
                }
                last = next;
            }
            System.out.println(total);
        }

    }
};
