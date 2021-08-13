package com.company.baekjoon.stepLoop;

import java.io.*;
import java.util.StringTokenizer;

public class StepThree11021 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int count = Integer.parseInt(br.readLine());
            for(int i=1; i<=count; i++){
               StringTokenizer stk = new StringTokenizer(br.readLine());
               while(stk.hasMoreTokens()){
                   bw.write("Case #"+ i + ": " +(Integer.parseInt(stk.nextToken()) + Integer.parseInt(stk.nextToken())) + "\n");
               }
            }
            br.close();
            bw.flush();
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
