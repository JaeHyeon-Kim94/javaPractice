package com.company.baekjoon.stepArrays;

import java.util.HashSet;
import java.util.Set;

public class A3052 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int count = 0, times=10;
        Set<Integer> set = new HashSet<Integer>();
       for(int i=0; i<times; i++){
           set.add(sc.nextInt()%42);
       }
        System.out.println(set.size());
    }
}
