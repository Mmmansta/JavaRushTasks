package com.javarush.task.pro.task04.task0423;

import java.util.Scanner;

/* 
Калибровка климата
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int summa =0;
        for (int i = 0; i < 4; i++) {
         summa+=number;
        }
        int otvet = summa/5;
        System.out.println(otvet);
    }
}
