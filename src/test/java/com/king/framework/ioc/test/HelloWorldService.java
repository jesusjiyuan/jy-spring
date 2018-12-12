package com.king.framework.ioc.test;

/**
 * @author: jiyuan
 * @date: 2018/11/25
 * @since 0.01
 */
public class HelloWorldService {
    private String text;
    private OutputService outputService;
    public String helloWorld(){
        System.out.println("hello world");
        return null;
    }
    public String text(){
        if(null !=outputService){
            System.out.println(text.toString()+outputService.helloWorld());
        }else {
            System.out.println(text.toString());
        }
        return null;
    }
}
