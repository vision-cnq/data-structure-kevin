package com.kevin.linertable;


/**
 * @author kevin
 * @version 1.0
 * @description        模拟ArrayList测试顺序存储结构表
 * @createDate 2019/3/26
 */
public class TestArrayList {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(123);
        list.add(321);
        list.add(456);
        list.add(678);
        list.add(789);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add(20,666);
        System.out.println(list.get(3));
        System.out.println(list.toString());

    }
}
