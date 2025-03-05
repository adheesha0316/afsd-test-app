package com.example.demofx;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        //collection framework and generice

        //type safe
        //length safe
        int[] ar = new int[10];

        //List, set ,Queue, map ----> interfaces

        ArrayList<Object> list = new ArrayList();
        list.add("a");
        list.add(10);
        list.add(56);
        list.add("adheesha");
        list.add(89.5);
        list.add(new Scanner(System.in).nextLine());

        list.get(2);

        System.out.println(list);

        /// ////////////////

        HashSet set = new HashSet();
        set.add(12);
        set.add("adheesha");
        set.add(90.6);
        set.add(12);
        set.add("anuradha");

        System.out.println(set);

        /// ///////////////

        PriorityQueue pq = new PriorityQueue();
        pq.add(20);
        pq.add(30);
        pq.add(40);

        System.out.println(pq);


        /// /////////////////////

        HashMap<Integer, Object> map = new HashMap();
        map.put(0, "adheesha");
        map.put(1, 23);
        map.put(2, 56.7);

        map.get(0);
    }
}
