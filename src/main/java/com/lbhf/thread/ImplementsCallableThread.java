package com.lbhf.thread;

import java.util.concurrent.Callable;

/**
 * 实现Callable接口，重写call方法，并有返回值
 */
public class ImplementsCallableThread implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("实现Callable接口，重写call方法，并有返回值");
        return "这是返回值";
    }
}
