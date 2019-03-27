package com.kevin.linertable;

import java.util.Arrays;

/**
 * @author kevin
 * @version 1.0
 * @description     顺序存储结构表
 *      底层采用的数组，长度可以动态变化
 * @createDate 2019/3/26
 */
public class ArrayList implements List {

    private Object[] elementData;   // 底层是一个数组，目前还没有确定长度

    private int size;   // 不是数组分配了多少空间，而是元素的个数


    public ArrayList(){
        // 没有指定长度，默认长度设为4
        this(4);

        // 没有指定长度，长度是0
        // elementData = new Object[]{};
    }

    // 指定数组的初始长度
    public ArrayList(int initialCapacity){
        // 给数组分配指定数量的空间
        elementData = new Object[initialCapacity];
        // 指定顺序表的元素个数，默认是0
        // size = 0;
    }

    public int size() {
        return size;
    }

    public Object get(int i) {
        if(i<0 || i>=size){
            // throw new RuntimeException("数组索引越界异常："+i);
            throw new MyArrayIndexOutOfBoundsException("数组索引越界异常："+i);
        }
        return elementData[i];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object e) {
        return false;
    }

    public int indexOf(Object e) {
        return 0;
    }

    public void add(int i, Object e) {
        // i的位置要正确
        if(i<0 || i>size){
            throw new MyArrayIndexOutOfBoundsException("数组索引越界异常：" + i);
        }

        // 数组满了，就需要扩容
        if(size == elementData.length) {
            grow();
        }
        // 后移i及其后面的元素，从最后一个元素开始
        for (int j = size; j > i; j--){
            elementData[j] = elementData[j-1];
        }

        // 往数组中第i个位置添加数据
        elementData[i] = e;
        // 元素个数+1
        size++;
    }

    public void add(Object e) {
        this.add(size,e);
        /*// 数组满了，就需要扩容
        if(size == elementData.length) {
            grow();
        }
        // 往数组中添加数据
        elementData[size] = e;
        // 元素个数+1
        size++;*/

        //elementData[size++] = e;
    }

    private void grow(){
        // 方式一
        elementData = Arrays.copyOf(elementData, elementData.length * 2);
        /*
        方式二：
        // 新创建一个新的数组，长度是旧数组2倍
        Object[] newArr = new Object[elementData.length*2];
        // 将旧数组的数据拷贝到新数组
        for (int i = 0;i<size;i++){
            // 拷贝数组
            newArr[i] = elementData[i];
        }
        // 让elementData指向新数组
        elementData = newArr;*/
    }


    public boolean addBefore(Object obj, Object e) {
        return false;
    }

    public boolean addAfter(Object obj, Object e) {
        return false;
    }

    public Object remove(int i) {
        return null;
    }

    public boolean remove(Object e) {
        return false;
    }

    public Object replace(int i, Object e) {
        return null;
    }


    @Override
    public String toString() {
        if(size == 0){
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        for (int i=0;i<size;i++){
            if(i!=size-1) {
                builder.append(elementData[i] + ",");
            }else{
                builder.append(elementData[i]);
            }
        }
        builder.append("]");

        return builder.toString();
    }
}
