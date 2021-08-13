package com.company.baekjoon.stepOperation;

public class StepOne10172 {
    public static void main(String[] args) {
        String[] dog = new String[5];
        dog[0] = "|\\_/|";
        dog[1] = "|q p|   /}";
        dog[2] = "( 0 )\"\"\"\\";
        dog[3] = "|\"^\"`    |";
        dog[4] = "||_/=\\\\__|";
        int i=0;
        for(String temp : dog){
            System.out.println(dog[i]);
            i++;
        }
    }
}
