package com.company.baekjoon.stepLoopByFor;

import  java.util.StringTokenizer;
public class StepThree10871 {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
       StringTokenizer stk = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(stk.nextToken()), criteria = Integer.parseInt(stk.nextToken());
        stk = new StringTokenizer(br.readLine());
        br.close();
        while(stk.hasMoreTokens()){
            int result = Integer.parseInt(stk.nextToken());
            if(criteria> result)
                System.out.print(result + " ");
        }
    }
}
