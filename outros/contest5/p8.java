/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class p8 {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();
        int n = Integer.parseInt(line);
        boolean novo = true;

        HashMap<String, Integer> arvores = new HashMap<String, Integer>();
        ArrayList<String> names = new ArrayList<String>();
        int total = 0;

        while ((line = in.readLine()) != null) {
            if (line.isEmpty() && !novo) {
                for (Map.Entry<String, Integer> entrySet : arvores.entrySet()) {
                    names.add(entrySet.getKey());
                }
                Collections.sort(names, null);
                for (String name : names) {
                    String a = name;
                    Integer c = arvores.get(a);

                    sb.append(a).append(" ").append(String.format(java.util.Locale.US, "%.4f", (float) (c * 100)  / (float) total)).append("\n");
                }
                sb.append("\n");
                novo = true;
                continue;
            }

            if (novo) {
                arvores = new HashMap<String, Integer>();
                names = new ArrayList<String>();
                total = 0;
                novo = false;
            }

            if(!line.isEmpty()){
                String arvore = line;
                int count = 1;
                if (arvores.containsKey(arvore)) {
                    count = arvores.get(arvore) + 1;
                }
                arvores.put(arvore, count);

                total++;
            }
        }
        
        for (Map.Entry<String, Integer> entrySet : arvores.entrySet()) {
            names.add(entrySet.getKey());
        }
        Collections.sort(names, null);
        for (String name : names) {
            String a = name;
            Integer c = arvores.get(a);
            sb.append(a).append(" ").append(String.format(java.util.Locale.US, "%.4f", (float) (c * 100) / (float) total)).append("\n");
        }

        System.out.print(sb.toString());
    }
}
