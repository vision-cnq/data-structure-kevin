package com.kevin.linertable;

/**
 * @author kevin
 * @version 1.0
 * @description     单链表存储结构表
 *
 * @createDate 2019/3/26
 */
public class SingleLinkedList implements List{

    private Node head = new Node();      // 头结点，不存储数据，为了编程方便
    private int size;       // 一共有几个结点

   @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int i) {
        // 与顺序表不一样，不能通过索引直接计算定位，需要从头结点开始进行查找
        Node p = head;
        for (int j = 0; j <= i; j++) {
            p = p.next;
        }
        return p.data;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object e) {
        return false;
    }

    @Override
    public int indexOf(Object e) {
        return 0;
    }

    @Override
    public void add(int i, Object e) {
        // 如果i位置错误抛出异常
        if(i < 0 || i > size){
            throw new MyArrayIndexOutOfBoundsException("数组指针越界异常：" + i);
        }
        // 找到前一个结点，从head结点开始
        Node p = head;
        for(int j = 0; j<i;j++){
            p = p.next;
        }
        // 新创建一个结点
        Node newNode = new Node();
        newNode.data = e;
        // 指明新结点的直接后继结点
        newNode.next = p.next;
        // 指明新结点的直接前驱结点
        p.next = newNode;
        // 元素数量+1
        size++;
    }

    @Override
    public void add(Object e) {
        this.add(size,e);
    }

    @Override
    public boolean addBefore(Object obj, Object e) {
        return false;
    }

    @Override
    public boolean addAfter(Object obj, Object e) {
        return false;
    }

    @Override
    public Object remove(int i) {
        return null;
    }

    @Override
    public boolean remove(Object e) {
        return false;
    }

    @Override
    public Object replace(int i, Object e) {
        return null;
    }

    @Override
    public String toString() {
        if(size == 0){
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        Node p = head.next;
        for(int i=0;i<size;i++){
            if(i !=size -1){
                builder.append(p.data+",");
            }else{
                builder.append(p.data);
            }
            //移动指针到下一个结点
            p  = p.next;

        }
        builder.append("]");
        return builder.toString();
    }
}
