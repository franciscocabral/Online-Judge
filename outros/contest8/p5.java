/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest8;

import java.util.Scanner;

class p5 {
//    private long[] array;
//    private long[] tempMergArr;
    private String[] array;
    private String[] tempMergArr;
    private int length;
    public long count = 0;

    public void sort(String inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new String[length];
//        this.tempMergArr = new long[length];
        doMergeSort(0, length - 1);
    }

    private void doMergeSort(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            doMergeSort(lowerIndex, middle);
            doMergeSort(middle + 1, higherIndex);
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i].compareTo(tempMergArr[j]) <= 0) {
//            if(tempMergArr[i] <= tempMergArr[j]){
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                count += (middle - i)+1;
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
        while (j <= higherIndex) {
            array[k] = tempMergArr[j];
            k++;
            j++;
        }

    }

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (s.hasNext()) {
            int n = s.nextInt();
            String[] matriculas = new String[n];
//            long[] intMatriculas = new long[n];
            
            for (int i = 0; i < n; i++) {
                matriculas[i] = s.next();
//                String[] tmp = matriculas[i].split("/");
//                intMatriculas[i] = Integer.parseInt(tmp[0]+tmp[1]);
            }
            p5 m = new p5();
            m.sort(matriculas);
            long count = m.count;
//            System.out.println(count);
            sb.append(count).append("\n");
        }
        System.out.print(sb);

    }
}
