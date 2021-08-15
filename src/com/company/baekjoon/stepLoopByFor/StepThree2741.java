package com.company.baekjoon.stepLoopByFor;

import java.io.*;

public class StepThree2741 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int endNo = Integer.parseInt(br.readLine());
            br.close();
            for (int i = 1; i <= endNo; i++) {
                bw.write(i + "\n");
            }
            bw.flush();
            bw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
