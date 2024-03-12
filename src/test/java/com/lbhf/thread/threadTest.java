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
    public void  testThread() throws InterruptedException {
        //1.继承Thread类
        new ExtendsThread().start();
        //2.实现Runable接口
        new Thread(new ImplementsThread()).start();
        //3.实现Callable接口
        new Thread(new FutureTask<>(new ImplementsCallableThread())).start();
        //4.使用ExecutorService线程池创建
        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.execute(()->{
            System.out.println(Thread.currentThread().getName()+"线程池创建的线程启动！");
        });
        pool.shutdown();
        // 又或者自定义线程池
        ThreadPoolExecutor poolB = new ThreadPoolExecutor(2, 3, 0,
                TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(3),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        poolB.submit(()->{
            System.out.println(Thread.currentThread().getName()+"4B......");
        });
        poolB.shutdown();
        //CompletableFuture是JDK1.8引入的新类，可以用来执行异步任务，如下
        CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName()+"5......");
            return "zhuZi";
        });
        // 需要阻塞，否则看不到结果
        Thread.sleep(1000);
    }
    @Test
    public void testAQS() throws InterruptedException {
        int count = 60;
        CountDownLatch countDownLatch =new CountDownLatch(count);
        for (int i = 0; i < count-1; i++) {
            ExtendsThread extendsThread = new ExtendsThread(countDownLatch,String.valueOf(i));
            extendsThread.start();
        }
        countDownLatch.await();
    }
}
