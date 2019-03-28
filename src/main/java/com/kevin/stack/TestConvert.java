package com.kevin.stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author kevin
 * @version 1.0
 * @description     10进制转换成2进制
 * @createDate 2019/3/27
 */
public class TestConvert {

    public static void main(String[] args) {
        stackHex();
        // ordinaryHex();
    }

    // 使用栈，将10进制转换成2进制
    public static void stackHex(){
        int n = 13;     // 给定一个十进制数
        int t = n;     // 被除数
        // 定义一个空栈
        Deque stack = new LinkedList();
        do {
            // 除以2求余数
            int mod = t%2;
            stack.push(mod);   // 入账
            // 输出余数
            // 除以2得到商,使用商做被除数
            t = t/2;
        }while(t>0);   // 商>0
        // 输出结果数据
        System.out.print("十进制："+n+"，转换成二进制：");
        while (!stack.isEmpty()){   // 栈非空
            System.out.print(stack.poll());
        }

    }

    // 使用普通的程序，将10进制转换成2进制
    public static void ordinaryHex(){

        int n = 13;     // 给定一个十进制数
        int t = n;     // 被除数
        String str = "";
        do {
            // 除以2求余数
            int mod = t%2;
            // 输出余数
            str = mod + str;
            // 除以2得到商,使用商做被除数
            t = t/2;
        }while(t>0);   // 商>0
        // 输出结果数据
        System.out.println("十进制："+n+"，转换成二进制："+str);

    }
}
