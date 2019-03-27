package com.kevin.linertable;

/**
 * @author kevin
 * @version 1.0
 * @description     单链表的结点
 * @createDate 2019/3/26
 */
public class Node {
    Object data;
    Node  next;
    public Node() {
    super();
    }
    public Node(Object data) {
       super();
       this.data = data;
    }
    public Node(Object data, Node next) {
        super();
        this.data = data;
        this.next = next;
    }
    public Object getData() {
    return data;
    }
    public void setData(Object data) {
    this.data = data;
    }
    public Node getNext() {
    return next;
    }
    public void setNext(Node next) {
    this.next = next;
    }
}