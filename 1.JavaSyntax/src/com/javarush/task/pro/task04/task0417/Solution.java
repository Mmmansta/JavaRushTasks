package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int meters = scan.nextInt();
        int kilo = (int) Math.round(meters * 3.6);
        System.out.println(kilo);


    }
}