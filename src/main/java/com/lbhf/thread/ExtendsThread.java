package com.lbhf.thread;

/**
 * 继承Thread类,重写Run方法
 */
public class ExtendsThread extends Thread{
    @Override
    public void run() {
        System.out.println("这里是重写的Run方法！");
    }
}
