package com.company.baekjoon.stepArrays;

import java.io.*;

public class A10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        int max = -1000000;
        int min = 1000000;
        String[] numArr = br.readLine().split(" ");
        br.close();
        for(String tmp : numArr){
            int compare = Integer.parseInt(tmp);
            if(compare<min){
                min = compare;
            }

            if(compare>max){
                max = compare;
            }
        }

        bw.write(min + " " + max);

        bw.close();
    }
}
