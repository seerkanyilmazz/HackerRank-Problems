package com.seerkanyilmazz.Staircase;

public class Solution {

    static void staircase(int n) {
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                if ((i + j) > n) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
