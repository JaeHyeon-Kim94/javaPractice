package com.company.baekjoon.stepLoopByFor;

public class StepThree2439 {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        for (int i = 0, count = Integer.parseInt(br.readLine()); count > i++; System.out.printf("%" + count + "s%n", "*".repeat(i)));
        br.close();
    }
}
//interface Main {
//    static void main(String[] A) {
//        String t = "";
//        for (int n = new java.util.Scanner(System.in).nextInt(), j = n; n-- > 0; System.out.printf("%" + j + "s\n", t += "*"))
//            ;
//    }
//}