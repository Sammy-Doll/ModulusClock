package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ModulusClock();

    }

    public static void ModulusClock() {
    Scanner klepto;
    klepto = new Scanner(System.in);

    int hour;
    int minute;
    System.out.println("Hello mortal. My constituents have highly awaited your pathetic arrival. Please, enter the current hour.");
    hour = klepto.nextInt();

    System.out.println("Wait, it's that time already?!");
    System.out.println("*whispering*");
    System.out.println("And, um... what be the current minutes?");
    minute = klepto.nextInt();

    int secondHour
    int secondMinute = minute > 59 ? (minute%60)+hour:minute;
    int thirdHour = hour > 12 ? hour%12:hour;
    int fourthHour = thirdHour > 1 ? hour:hour+1;


    System.out.println("So, the time is "+fourthHour+":"+ secondMinute);
    System.out.println("... fuc-");


    }
}