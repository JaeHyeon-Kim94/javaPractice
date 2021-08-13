package com.company.baekjoon.stepIf;

import java.util.Scanner;

public class StepTwo1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B;

        A = sc.nextInt();
        B = sc.nextInt();

        if(A-B>0){
            System.out.println(">");
        }else if(A-B<0){
            System.out.println("<");
        }else{
            System.out.println("==");
        }
    }
}
