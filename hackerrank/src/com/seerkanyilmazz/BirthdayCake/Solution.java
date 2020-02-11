package com.seerkanyilmazz.BirthdayCake;

public class Solution {

    static int birthdayCakeCandles(int[] ar) {
        int largest = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0; i<ar.length;i++){
            if(largest == ar[i]){
                count++;
            }
            if(ar[i]>largest){
                largest = ar[i];
                count = 1;
            }
        }
        return count;
    }
}
