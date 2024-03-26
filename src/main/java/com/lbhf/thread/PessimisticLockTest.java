package com.lbhf.thread;


import io.netty.channel.Channel;
import org.ehcache.xml.model.ThreadPoolsType;
import sun.misc.Unsafe;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.locks.ReentrantLock;

public class PessimisticLockTest {
        public void test(){
            synchronized (this){

            }
            ReentrantLock reentrantLock = new ReentrantLock();
            reentrantLock.lock();
            try {

            }catch (Exception e){
                e.printStackTrace();
            }finally {
                reentrantLock.unlock();
            }
            new Thread(()->{

            });
        }

    public static void main(String[] args) throws Exception {
    }



}
