package com.company.baekjoon.stepIf;

import java.util.Scanner;

public class StepTwo2884 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hour, minute;
        hour = sc.nextInt();
        minute = sc.nextInt() - 45;

        if (minute < 0 && hour != 0)
            System.out.println((hour-1) + " " + (60 + minute));
        if (minute < 0 && hour == 0)
            System.out.println(23 + " " + (60 + minute));
        if (minute >= 0)
            System.out.println(hour + " " + minute);

        sc.close();
    }
}
