package com.company.baekjoon.stepLoop;

import java.util.Scanner;

public class StepThree2739 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();

        int i=1;
        while(i<=9){
            System.out.println(times+" * "+ i + " = "+times*i);
            i++;
        }
        sc.close();
    }

}
