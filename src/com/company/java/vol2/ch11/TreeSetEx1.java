package com.company.java.vol2.ch11;

import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args) {

        TreeSet set = new TreeSet();

        //생성자의 인자에 Comparator => 해당 정렬기준에 맞게 Tree구성. Set이므로 중복 X
        //TreeSet set = new TreeSet(String.CASE_INSENSITIVE_ORDER);

        String from = "b";
        String to = "d";

        set.add("abc");     set.add("alien");       set.add("bat");
        set.add("car");     set.add("Car");         set.add("disc");
        set.add("dance");   set.add("dZZZZ");       set.add("dzzzz");
        set.add("elephant");set.add("elevator");    set.add("fan");
        set.add("flower");

        System.out.println(set);
        System.out.println("range search : from " + from + " to " + to);
        System.out.println("result1 : " + set.subSet(from, to));
        System.out.println("result2 : " + set.subSet(from, to + "zzz"));
    }
}
