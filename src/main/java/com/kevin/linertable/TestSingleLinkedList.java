package com.kevin.linertable;


/**
 * @author kevin
 * @version 1.0
 * @description        模拟SingleLinkedList测试单链表存储结构表
 * @createDate 2019/3/26
 */
public class TestSingleLinkedList {

    public static void main(String[] args) {
        List list = new SingleLinkedList();
        list.add(123);
        list.add(321);
        list.add(456);
        list.add(678);
        list.add(789);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add(2,666);
        System.out.println(list.get(3));
        System.out.println(list.toString());

    }
}
