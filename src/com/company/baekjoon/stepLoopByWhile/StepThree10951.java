package com.company.baekjoon.stepLoopByWhile;

public class StepThree10951 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        while(sc.hasNextInt()){
            System.out.println(sc.nextInt()+sc.nextInt());
        }
        sc.close();
    }
}
