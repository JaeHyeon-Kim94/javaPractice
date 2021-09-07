package com.company.baekjoon.stepArrays;

public class A2577 {
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int count = 0;
        String multiple = sc.nextInt() *sc.nextInt()*sc.nextInt()+"";

        char[] chrArr = multiple.toCharArray();

        for(int i=0; i<=9; i++){
            for(char tmp : chrArr){
                if((tmp-'0')==i) count++;
            }
            System.out.println(count);
            count=0;
        }
    }
}
