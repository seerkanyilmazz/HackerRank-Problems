package com.seerkanyilmazz.JavaDateandTime;

import java.time.*;

class Solution {


    public static String findDay(int month, int day, int year) {
        LocalDate ld = LocalDate.of(year,month,day);
        return ld.getDayOfWeek().name();
    }

}
