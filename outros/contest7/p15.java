/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest7;

import java.util.regex.*;
import java.util.Scanner;

public class p15 {

    public static void backtracking(String[] words, String rule, int count, String finalWord){
        
    }
    
    public static String implode(String[] ary, String delim) {
        String out = "";
        for (int i = 0; i < ary.length; i++) {
            if (i != 0) {
                out += delim;
            }
            out += ary[i];
        }
        return out;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner s = new Scanner(System.in);
        int n, m;
        while (s.hasNext()) {
            n = s.nextInt();
            String words[] = new String[n];
            for (int i = 0; i < n; i++) {
                words[i] = s.next();
            }
            m = s.nextInt();
            String rules[] = new String[n];
            for (int i = 0; i < m; i++) {
                rules[i] = s.next();
            }

            String allWords = '('+implode(words,"|")+')';
            for (int i = 0; i < m; i++) {
                String rule = rules[i];
                rule = rule.replaceAll("#",allWords);
                rule = rule.replace("0", "\\d");
                System.out.println(rule);
                Pattern patt = Pattern.compile(rule);
            }
        }

        System.out.print(sb.toString());
    }
}
