package com.Someclass;

import java.util.*;

public class TestCalendar {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar(2999, 10, 9, 22, 10, 5);
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);
    }
}
