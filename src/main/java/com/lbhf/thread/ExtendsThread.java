package com.lbhf.thread;

import java.util.concurrent.CountDownLatch;

/**
 * 继承Thread类,重写Run方法
 */
public class ExtendsThread extends Thread{
    private CountDownLatch countDownLatch;
    private String threadName;
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"这里是重写的Run方法！");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        countDownLatch.countDown();
        System.out.println("这是线程:"+threadName);
    }

    public ExtendsThread(CountDownLatch countDownLatch, String threadName) {
        this.countDownLatch = countDownLatch;
        this.threadName = threadName;
    }

    public ExtendsThread() {
    }
}
