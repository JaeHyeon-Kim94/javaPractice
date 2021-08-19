package com.company.java.vol1.ch3;

public class OperatorEx22 {

    public static void main(String[] args){
        float f = 0.1f;
        double d = 0.1d;
        System.out.printf("f =%19.17f%n", f);
        System.out.printf("d =%19.17f%n", d);
        System.out.println(f==(double)d);
    }
}
