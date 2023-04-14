package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner scan = new Scanner(System.in);
        boolean liquid = scan.nextBoolean();
        int a;
        if (liquid == false) {
            a = (int) Math.floor(glass);
        } else {
            a = (int) Math.ceil(glass);
        }
        System.out.println(a);

    }
}





