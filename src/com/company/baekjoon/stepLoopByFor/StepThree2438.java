package com.company.baekjoon.stepLoopByFor;

import java.io.*;

public class StepThree2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        for(int i=1; i<=count; i++){
                bw.write("*".repeat(i));
                bw.newLine();
        }
        bw.close();
        br.close();
    }
}
