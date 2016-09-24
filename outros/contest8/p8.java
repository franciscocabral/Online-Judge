/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest8;

import java.util.Scanner;

class p8 {
    public static float calcDist(float x1, float y1, float x2, float y2){
        return ((float)Math.ceil(Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2)) * 100))/100;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int X = s.nextInt();
        int[] esconderijos = new int[X+1];
        for(int z = 0; z <= X; z++){
            esconderijos[z] = 0;
        }
        
        for (int z = 0; z < n; z++) {
            int tmpX = s.nextInt();
            int tmpY = s.nextInt();
            if(esconderijos[tmpX] == 0){
                esconderijos[tmpX] = tmpY;
            }else{
                if(Math.abs(esconderijos[tmpX]) < Math.abs(tmpY)){
                    esconderijos[tmpX] = tmpY;
                }
            }
        }
        
        float maiorX = -1;
        float maiorDist = -1;
        for (int x = 0; x <= X*100; x++) {
            for(int tmpX = 0; tmpX <= X; x++){
                if(esconderijos[tmpX] == 0) continue;
                float dist = calcDist(x, 0, tmpX, esconderijos[tmpX]);
                if(maiorDist < dist){
                    maiorDist = dist;
                    maiorX = x/100;
                }
            }
        }
        
        
        System.out.println(maiorX+" "+maiorDist);
    }
}
