package u10394;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    static int MAX = 20000001;
    static ArrayList<Integer> prime = new ArrayList<Integer>();
    static ArrayList<Integer> primeTwin = new ArrayList<Integer>();
    static boolean[] isPrime = new boolean[MAX];
    
    public static void precalc(){
        for(int i = 0; i < MAX; i++) isPrime[i] = true;
        isPrime[0] = false;
        isPrime[1] = false;    
        for(int i = 2; i < MAX; i++){
            if(isPrime[i]){
                if(isPrime[i-2])
                    primeTwin.add(i-2);
                prime.add(i);
                int j = 2;
                while(j*i < MAX){
                    isPrime[j*i] = false;
                    j++;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        precalc();
        while(s.hasNext()){
            int n = s.nextInt();
            if(n == 0) break;
            int primeI = primeTwin.get(n-1);
            sb.append("(").append(primeI).append(", ").append(primeI+2).append(")\n");
        }
        System.out.print(sb.toString());
    }
}
