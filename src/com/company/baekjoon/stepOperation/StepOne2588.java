package com.company.baekjoon.stepOperation;

import java.util.Scanner;

public class StepOne2588 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B;

        A = sc.nextInt();
        B = sc.nextInt();

        char[] chArr = Integer.toString(B).toCharArray();

        for (int i = chArr.length-1 ; i >= 0; i--) {
            System.out.println((chArr[i] - '0') * A);
        }
        System.out.println(A * B);
        sc.close();
    }
}
