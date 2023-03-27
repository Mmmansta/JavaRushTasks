package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        while (true) {
            if (scan.hasNextInt()) {
                int number = scan.nextInt();
                sum += number;
            } else if (scan.hasNextLine()) {
                String enter = scan.nextLine();
                if (enter.equals("ENTER")) {
                    break;
                }
            }
        }
        System.out.println(sum);


    }
}