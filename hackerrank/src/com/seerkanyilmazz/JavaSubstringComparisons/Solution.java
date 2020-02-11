package com.seerkanyilmazz.JavaSubstringComparisons;

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String currentSubstring = s.substring(0, k);
        String smallest = currentSubstring;
        String largest = currentSubstring;

        for (int i = 1; i <= s.length() - k; i++) {
            currentSubstring = s.substring(i, i + k);
            if (currentSubstring.compareTo(largest) > 0) {
                largest = currentSubstring;
            }

            if (currentSubstring.compareTo(smallest) < 0) {
                smallest = currentSubstring;
            }
        }


        return smallest + "\n" + largest;
    }

}