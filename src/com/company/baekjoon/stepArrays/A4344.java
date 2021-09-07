package com.company.baekjoon.stepArrays;

import java.text.DecimalFormat;
import java.util.Arrays;

public class A4344 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int tcCount = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < tcCount ; i++){
            int stCount = sc.nextInt();
            int[] score = new int[stCount];
            for(int j = 0 ; j < score.length; j++){
                score[j] = sc.nextInt();
            }
            double avg = Arrays.stream(score).average().getAsDouble();
            int count = 0;
            for(int tmp : score){
                if(tmp>avg){
                    count++;
                }
            }
            double result = count/(double)stCount*100;
            DecimalFormat f = new DecimalFormat("0.000");
            sb.append(f.format(result)+"%\n");
        }
        System.out.println(sb.toString());
    }
}
