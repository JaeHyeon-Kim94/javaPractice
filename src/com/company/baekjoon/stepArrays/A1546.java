package com.company.baekjoon.stepArrays;

import java.io.*;
import java.util.Arrays;

public class A1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        String[] tmp = br.readLine().split("\\s");

        int[] score = new int[count];

        for(int i=0; i<tmp.length; i++){
            score[i] = Integer.parseInt(tmp[i]);
        }

        Arrays.sort(score);
        int max = score[score.length-1];
        double result = (Arrays.stream(score).sum())/((double)(max*count))*100;

        bw.write(result+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
