package com.company.baekjoon.stepArrays;

import java.io.*;
import java.util.StringTokenizer;

public class A8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int score = 0;
        StringTokenizer stk = null;

        for(int i=0; i<count; i++){
            String result = br.readLine();
            stk = new StringTokenizer(result, "X");
            while(stk.hasMoreTokens()){
                int o = stk.nextToken().length();
                score += (o+1)*o/2;
            }
            bw.write(score+"\n");
            score = 0;
        }
        bw.close();
        br.close();
    }
}
