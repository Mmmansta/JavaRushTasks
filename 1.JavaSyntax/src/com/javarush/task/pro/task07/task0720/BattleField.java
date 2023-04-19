package com.javarush.task.pro.task07.task0720;

/* 
Галавир XIII (3)
*/

import java.nio.charset.StandardCharsets;

public class BattleField {
    public static String nimrodDefence = new String("Вражеская атака отбита") ;
    public static String nimrodAttack = "Наносим контр удар";
    public static String nimrodDestroy = "Вражеский удар не выдержан";
    public static String galavirDefence = "Наша атака успешно отражена врагом";
    public static String galavirAttack = new String("Враг наносит удар".getBytes(StandardCharsets.UTF_8));
    public static String galavirDestroy = "Вражеский корабль повержен";

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
