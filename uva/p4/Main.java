package p4;

import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner s = new Scanner(System.in);
        int[] valor = {5, 10, 20, 50, 100, 200, 500, 1000, 2000, 5000, 10000};
        long[] ways = new long[30001];
        
        ways[0] = 1;
        for(int i = 0; i < valor.length; i++){
            for(int j =valor[i]; j < 30001; j++){
                ways[j] += ways[j-valor[i]];
            }
        }
        
        String str = s.next();
        double tmp = Double.valueOf(str);
        String tmp2 = str.replace(".", "");
        
        int num = Integer.valueOf(tmp2);        
        while(num != 0){
            sb.append(String.format(Locale.US ,"%6s %16d\n", str, ways[num]));
           
            str = s.next();
            tmp = Double.valueOf(str);
            tmp2 = str.replace(".", "");
            num = Integer.valueOf(tmp2);
        }
        System.out.print(sb);
        
    }
    
}
