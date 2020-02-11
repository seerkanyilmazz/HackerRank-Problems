package com.seerkanyilmazz.JavaRegex;

import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex{
    String number = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = number + "." +number +"."+number + "."+number;
}



