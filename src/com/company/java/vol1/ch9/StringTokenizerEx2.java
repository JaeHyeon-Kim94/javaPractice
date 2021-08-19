package com.company.java.vol1.ch9;

import java.util.StringTokenizer;

public class StringTokenizerEx2 {
    public static void main(String[] args) {
        String expression = "x=100*(200+300)/2";
                                                                //구분자           구분자도 token으로 간주되도록 할지.
        StringTokenizer st = new StringTokenizer(expression, "+-*/=()", true);

        while(st.hasMoreTokens())
            System.out.println(st.nextToken());
    }
}
