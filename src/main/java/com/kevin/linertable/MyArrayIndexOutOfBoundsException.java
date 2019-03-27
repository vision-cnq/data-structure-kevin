package com.kevin.linertable;

/**
 * @author kevin
 * @version 1.0
 * @description     自定义异常
 * @createDate 2019/3/26
 */
public class MyArrayIndexOutOfBoundsException extends RuntimeException{

    public MyArrayIndexOutOfBoundsException() {
    }

    public MyArrayIndexOutOfBoundsException(String message) {
        super(message);
    }
}
