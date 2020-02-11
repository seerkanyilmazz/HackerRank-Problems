package com.seerkanyilmazz.MiniMaxSum;

public class Solution {

    static void miniMaxSum(int[] arr) {
        long min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0;

        for(int i:arr){
            sum+= i;
            min = Math.min(min,i);
            max = Math.max(max,i);
        }
        System.out.println((sum - max)+" "+(sum-min));
    }
}
