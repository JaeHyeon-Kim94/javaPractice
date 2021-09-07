package com.company.java.vol2.ch11;

import java.util.Arrays;
import java.util.Comparator;

public class CmoparatorEx {
    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "lion", "tiger"};

        Arrays.sort(strArr);
        System.out.println("strArr= " + Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
        System.out.println("strArr = " + Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending());
        System.out.println("strArr = " + Arrays.toString(strArr));
    }
}

class Descending implements Comparator {

    public int compare(Object o1, Object o2) {
        if( o1 instanceof Comparable && o2 instanceof Comparable){
            Comparable c1 = (Comparable)o1;
            Comparable c2 = (Comparable)o2;
            return c1.compareTo(c2)*-1; //-1을 곱해서 기존 정렬방식의 역으로 변경
            //return c2.compareTo(c1); //c1.compareTo(c2)

        }
        return -1;
    }
}
