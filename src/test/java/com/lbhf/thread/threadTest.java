package com.lbhf.thread;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.*;

@SpringBootTest
public class threadTest {
    /**
     * 多线程test
     */
    @Test
    public void  testThread(){
        //1.继承Thread类
        new ExtendsThread().start();
        //2.实现Runable接口
        new Thread(new ImplementsThread()).start();
        //3.实现Callable接口
        new Thread(new FutureTask<>(new ImplementsCallableThread())).start();
        //4.使用ExecutorService线程池创建
        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.execute(()->{
            System.out.println("线程池创建的线程启动！");
        });
        pool.shutdown();
        // 又或者自定义线程池
        ThreadPoolExecutor poolB = new ThreadPoolExecutor(2, 3, 0,
                TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(3),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        poolB.submit(()->{
            System.out.println("4B......");
        });
        poolB.shutdown();
    }
}
