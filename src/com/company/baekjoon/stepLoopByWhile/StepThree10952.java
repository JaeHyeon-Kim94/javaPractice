package com.company.baekjoon.stepLoopByWhile;

public class StepThree10952 {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        int a, b;
        while(true){
            String[] tmp = br.readLine().split(" ");
            a = Integer.parseInt(tmp[0]);
            b = Integer.parseInt(tmp[1]);
            if(a==0 && b==0) break;
            System.out.println(a+b);
        }
    }
}
