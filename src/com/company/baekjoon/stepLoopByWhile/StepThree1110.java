package com.company.baekjoon.stepLoopByWhile;

public class StepThree1110 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int crt = Integer.parseInt(sc.nextLine()), tmp = Integer.parseInt(crt%10 + "" + ((crt/10 + crt%10)%10)), count = 1;
        String change="";
        while(crt!=tmp){
            count++;
            change = tmp%10 + "" + ((tmp/10 + tmp%10)%10);
            tmp = Integer.parseInt(change);
            change="";
        }
        System.out.println(count);
    }
}
