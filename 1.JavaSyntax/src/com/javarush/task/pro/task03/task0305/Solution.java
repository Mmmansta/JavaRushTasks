package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();

        if (number1 == number2 && number2 == number3) {
            System.out.println(number1 + " " + number2 + " " + number3);
        } else if (number1 == number2) {
            System.out.println(number1 + " " + number2);
        } else if (number2 == number3) {
            System.out.printf(number2 + " " + number3);
        } else if (number1 == number3) {
            System.out.println(number1 + " " + number3);
        }


    }
}
