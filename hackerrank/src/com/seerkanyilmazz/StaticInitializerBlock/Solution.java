package com.seerkanyilmazz.StaticInitializerBlock;

import java.util.*;


    public class Solution {

        static int B;
        static int H;
        static boolean flag = true;
        static {
            Scanner scanner = new Scanner(System.in);
            B = scanner.nextInt();
            H = scanner.nextInt();
            scanner.close();

            try{
                if (B<=0 || H<=0){
                    flag = false;
                    throw new Exception("Breadth and height must be positive");
                }
            } catch(Exception e){
                System.out.println(e);
                System.exit(0);
            }
        }
}
