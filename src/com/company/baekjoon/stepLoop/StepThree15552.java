package com.company.baekjoon.stepLoop;

import java.io.*;

public class StepThree15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        while(count>0){
            count--;
            String[] strArr = br.readLine().split(" ");
            int result = Integer.parseInt(strArr[0])+Integer.parseInt(strArr[1]);
            bw.write(result+"\n");
        }
        bw.close();
        br.close();
    }
}
