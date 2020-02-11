package com.seerkanyilmazz.PlusMinus;

public class Solution {

    static void plusMinus(int[] arr) {

            int pos = 0;
            int neg = 0;
            int zer = 0;

            for( int i : arr){
                if (i >0){
                    pos++;
                }if(i<0){
                    neg++;
                }if(i == 0){
                    zer++;
                }
            }
            System.out.printf("%.6f%n", (double)pos / arr.length);
            System.out.printf("%.6f%n", (double)neg / arr.length);
            System.out.printf("%.6f%n", (double)zer / arr.length);
    }
}
