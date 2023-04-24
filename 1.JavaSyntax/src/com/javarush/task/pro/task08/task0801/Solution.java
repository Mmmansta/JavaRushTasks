package com.javarush.task.pro.task08.task0801;

import static java.lang.Math.toRadians;

/* 
Утильный класс: часть 1
*/

public class Solution {

    public static double sin(double a) {
        double s = Math.sin(Math.toRadians(a));
        return s;
    }

    public static double cos(double a) {
        double q = Math.cos(Math.toRadians(a));
        return q;
    }

    public static double tan(double a) {
        double x = Math.tan(Math.toRadians(a));
        return x;
    }
}
