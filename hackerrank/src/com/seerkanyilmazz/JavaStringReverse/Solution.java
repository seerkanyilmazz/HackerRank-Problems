package com.seerkanyilmazz.JavaStringReverse;


import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        int aPointer = 0;
        int bPointer = A.length() - 1;

        while(aPointer <= bPointer){
            if(A.charAt(aPointer)!= A.charAt(bPointer)){
                System.out.println("No");
                return;
            }
            aPointer++;
            bPointer--;
        }
        System.out.println("Yes");
    }
}




