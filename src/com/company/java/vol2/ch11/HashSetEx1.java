package com.company.java.vol2.ch11;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {
    public static void main(String[] args) {
        Object[] objArr = {"1", new Integer(1), "2", "3", "3", "4", "4", "4", "4"};
        Set set = new HashSet();

        for(int i = 0 ; i < objArr.length; i++) {
            System.out.println("set.add(objArr["+i+"]) : " + set.add(objArr[i])); //중복요소 저장여부 확인.
        }

        System.out.println("result : " + set);  //HashSet에 저장된 요소들 출력.
    }
}
