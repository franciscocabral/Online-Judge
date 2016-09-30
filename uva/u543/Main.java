package u543;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    static ArrayList<Integer> prime = new ArrayList<Integer>();
    
    public static void precalc(){
        boolean[] tmp = new boolean[1000001];
        tmp[0] = false;
        tmp[1] = false;    
        for(int i = 2; i < 1000000; i++){
            if(tmp[i]){
                prime.add(i);
                int j = 2;
                while(j*i < 1000000){
                    tmp[j*i] = false;
                    j++;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        precalc();
        int n = s.nextInt();
        while(n != 0){
            
            n = s.nextInt();
        }
        
    }

}
