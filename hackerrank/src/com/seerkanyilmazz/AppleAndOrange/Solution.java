package com.seerkanyilmazz.AppleAndOrange;

public class Solution {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int distance;
        int countApples = 0;
        int countOranges = 0;
        final int APPLES = apples.length;
        final int ORANGES = oranges.length;
        final int LENGTH = Math.max(APPLES, ORANGES);

        for (int i = 0; i < LENGTH ; ++i){
            if (i < APPLES){
                distance = a + apples[i];
                if (distance >= s && distance <= t) {
                    ++countApples;
                }
            }

            if (i < ORANGES){
                distance = b + oranges[i];
                if (distance >= s && distance <= t){
                    ++countOranges;
                }
            }
        }

        System.out.printf("%d%n%d%n", countApples, countOranges);
    }
}
