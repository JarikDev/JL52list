package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list.size());
        List list1 = new Vector();
        List list2  = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }




    }
}
