package com.company.java.vol1.ch9;
//오토박싱 & 언박싱
//autoboxing : primitive type -> wrapper class auto casting
//unboxing  :  wrapper class -> primitive type auto casting
public class WrapperEx3 {
    public static void main(String[] args) {
        int i = 10;

        //autoboxing
        Integer intg = (Integer)i;  //Integer intg = Integer.valueOf(i); casting은 생략가능.
        Object obj = (Object)i;     //Object obj = (Object)Integer.valueOf(i);

        Long lng = 100L;            //Long lng = new Long(100L);

        int i2 = intg + 10;         //참조형과 기본형간 연산 가능.
        long l = intg + lng;        //참조형간 덧셈도 가능

        //unboxing
        Integer intg2 = new Integer(20);
        int i3 = (int)intg2;        //참조형 -> 기본형 변환 가능. casting은 생략가능

        Integer intg3 = intg2 + i3;
    }
}
