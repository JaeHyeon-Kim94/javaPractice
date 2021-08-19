package com.company.java.vol1.ch3;

public class OperatorEx15 {
    public static void main(String[] args){
        char lowerCase = 'a';
        char upperCaseByVariable = (char) (lowerCase-32);
        char upperCaseByLiteral = 'a'-32;

        System.out.println(upperCaseByVariable);
        System.out.println(upperCaseByLiteral);
    }
}
