package com.company.baekjoon.stepLoopByFor;

import java.util.Scanner;

public class StepThree8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int endNo = sc.nextInt();
        sc.close();
        int i = 1;
        int sum=0;
        do{
            sum += i;
            i++;
        }while(i<=endNo);
        System.out.println(sum);

    }
}
