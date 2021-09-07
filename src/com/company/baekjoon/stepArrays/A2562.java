package com.company.baekjoon.stepArrays;

import java.util.Scanner;

public class A2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0, max = 1;
        int[] numArr = new int[9];

        for(int i = 0; i < numArr.length; i++){
            numArr[i] = sc.nextInt();
            if(numArr[i]>max){
                max = numArr[i];
                count = i+1;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}
