package com.javarush.task.pro.task07.task0720;

/* 
������� XIII (3)
*/

import java.nio.charset.StandardCharsets;

public class BattleField {
    public static String nimrodDefence = new String("��������� ����� ������") ;
    public static String nimrodAttack = "������� ����� ����";
    public static String nimrodDestroy = "��������� ���� �� ��������";
    public static String galavirDefence = "���� ����� ������� �������� ������";
    public static String galavirAttack = new String("���� ������� ����".getBytes(StandardCharsets.UTF_8));
    public static String galavirDestroy = "��������� ������� ��������";

    public static void main(String[] args) {
        GalavirXIII galavirXIII = new GalavirXIII();
        Nimrod nimrod = new Nimrod();
        do {
            System.out.println(galavirAttack);
            int galavirAttack = galavirXIII.attack();
            System.out.println("GalavirXIII attacked = " + galavirAttack);
            nimrod.defend(galavirAttack);
            System.out.println("Nimrod health = " + nimrod.health);
            if (isNimrodAlive(nimrod)){
                System.out.println(nimrodAttack);
                int nimrodAttack = nimrod.attack();
                System.out.println("Nimrod attack = " + nimrodAttack);
                galavirXIII.defend(nimrodAttack);
                System.out.println("GalavirXIII health = " + galavirXIII.health);
            }
            else {
                break;
            }
        }
        while (isGalavirAlive(galavirXIII));

    }

    public static boolean isNimrodAlive(Nimrod nimrod) {
        if (nimrod.health > 0) {
            System.out.println(nimrodDefence);
            return true;
        } else {
            System.out.println(nimrodDestroy);
            return false;
        }
    }

    public static boolean isGalavirAlive(GalavirXIII galavir) {
        if (galavir.health > 0) {
            System.out.println(galavirDefence);
            return true;
        } else {
            System.out.println(galavirDestroy);
            return false;
        }
    }
}
