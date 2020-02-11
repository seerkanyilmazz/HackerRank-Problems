package com.seerkanyilmazz.MigratoryBirds;

import java.util.List;

public class Solution {

    static int migratoryBirds(List<Integer> arr) {

        int max = 0;
        int[] countArray = new int[3<<1];
        for(int val:arr){
            countArray[val]++;
            max = Math.max(max,countArray[val]);
        }
        for(int i = 0; i<countArray.length;i++){
            if(countArray[i]== max){
                return i;
            }
        }
        return 0;
    }
}
