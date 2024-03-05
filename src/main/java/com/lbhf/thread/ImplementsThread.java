package com.lbhf.thread;

/**
 * 实现Runnable接口，重写run方法
 */
public class ImplementsThread implements Runnable{
    @Override
    public void run() {
        System.out.println("实现Runnable接口后重写的Run方法");
    }
}
