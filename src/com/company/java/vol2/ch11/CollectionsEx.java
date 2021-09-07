package com.company.java.vol2.ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class CollectionsEx {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list);
        Collections.addAll(list, 1, 2, 3, 4, 5);
        Collections.rotate(list, 2);
        Collections.swap(list, 0, 2);
        Collections.shuffle(list);
        Collections.sort(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list, Collections.reverseOrder()));

        Collections.fill(list, 9);
        System.out.println(list);
        List newList = Collections.nCopies(list.size(), 2);
        System.out.println("newList : "  + newList);
        System.out.println(Collections.disjoint(list, newList));

        Collections.copy(list, newList);
        System.out.println("newList : " + newList);
        System.out.println("list : " + list);

        Collections.replaceAll(list, 2, 1);
        System.out.println("list : " + list);
        Enumeration e = Collections.enumeration(list);
        ArrayList list2 = Collections.list(e);
        System.out.println("list2 : " + list2);

    }
}
