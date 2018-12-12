package com.king.framework.ioc.test;

/**
 * @author: jiyuan
 * @date: 2018/11/25
 * @since 0.01
 */
public class OutputService {
    private String text;
    public String helloWorld(){
        System.out.println("OutputService: hello world");
        return "hello world";
    }
}
