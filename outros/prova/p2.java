/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class p2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        HashMap<Integer, Integer> num = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            int tmp = s.nextInt();

            if (num.containsKey(tmp)) {
                num.put(tmp, num.get(tmp) + 1);
            } else {
                num.put(tmp, 1);
            }
        }
        List sortedKeys = new ArrayList(num.keySet());
        Collections.sort(sortedKeys);
                
        for (Object key : sortedKeys ) {
            Integer value = num.get(key);
            System.out.println(key + " aparece " + value + " vez(es)");
        }
    }
}
