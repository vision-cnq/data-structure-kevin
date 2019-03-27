package com.kevin;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author kevin
 * @version 1.0
 * @description
 * @createDate 2019/3/26
 */
public class Demo {

    public static void main(String[] args) {

        //List list = new ArrayList();
        //list.add("d");

        LinkedList linkedList = new LinkedList();
        linkedList.add(58);
        linkedList.add(68);
        linkedList.add(78);
        linkedList.add(88);
        linkedList.add(98);
        System.out.println(linkedList.toString());

    }
}
