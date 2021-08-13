package com.company.baekjoon.stepOperation;

public class StepOne10171 {
    public static void main(String[] args){
    String[] cat    = new String[4];

    cat[0] = "\\    /\\";
    cat[1] = " )  ( ')";
    cat[2] ="(  /  )";
    cat[3] =" \\(__)|";
    int i = 0;
    for(String temp : cat){
        System.out.println(cat[i]);
        i++;
    }
    }
}
