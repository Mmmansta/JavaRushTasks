package com.javarush.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Треугольник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int number1 = scan.nextInt();
       int number2 = scan.nextInt();
       int number3 = scan.nextInt();
       if(number1<number2+number3){
           System.out.println(TRIANGLE_EXISTS);
       } else if (number2<number1+number3) {
           System.out.println(TRIANGLE_EXISTS);
       } else if (number3<number1+number2) {
           System.out.println(TRIANGLE_EXISTS);
       }
       else
           System.out.println(TRIANGLE_NOT_EXISTS);

    }
}
