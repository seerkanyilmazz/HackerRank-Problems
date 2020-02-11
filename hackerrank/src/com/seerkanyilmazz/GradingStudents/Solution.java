package com.seerkanyilmazz.GradingStudents;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    static class Result {

        public static List<Integer> gradingStudents(List<Integer> grades) {
            // Write your code here
            int[] ret = new int[grades.size()];
            for(int i = 0;i < ret.length;i++){
                ret[i] = grades.get(i);
            }
            int a = 0;

            for(int i = 0; i < ret.length; i++){
                if (ret[i]>=38){
                    int remainder = ret[i] % 5;
                    int leastMultiple = ret[i] - remainder;
                    int upperMultiple = leastMultiple + 5;
                    int difference = upperMultiple - ret[i];

                    if(difference < 3){
                        ret[i] = upperMultiple;
                    }
                }
            }
            List<Integer> grades1 = new ArrayList<Integer>(ret.length);
            for (int i : ret){
                grades1.add(i);
            }
            return grades1;
        }

    }
}
