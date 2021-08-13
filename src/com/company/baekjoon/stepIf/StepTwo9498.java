package com.company.baekjoon.stepIf;

import java.util.Scanner;

public class StepTwo9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score;
        String grade = "";
        score = sc.nextInt();

        if(score>100 || score<0){
            System.out.println("유효하지 않은 점수");
            System.exit(-1);
        }

        switch(score/10){
            case 10: case 9:
                grade="A";
                break;
            case 8:
                grade="B";
                break;
            case 7:
                grade="C";
                break;
            case 6:
                grade="D";
                break;
            default:
                grade="F";

        }
        System.out.println(grade);
        sc.close();
    }
}
