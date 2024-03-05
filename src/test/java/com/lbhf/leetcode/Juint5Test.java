package com.lbhf.leetcode;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Juint5Test {
    @Test
    void testMethod(){
        System.out.println("测试方法执行！");
    }
    @Test
    void testMethod02(){
        System.out.println("测试方法执行！");
    }
    @BeforeEach
    void testBeforeEach(){
        System.out.println("测试方法前置执行");
    }
    @BeforeAll
    static void testBeforeAll(){
        System.out.println("所有用例前置");
    }
    @AfterAll
    static void testAfterAll(){
        System.out.println("所有用例后置");
    }
    @AfterEach
    void testAfterEach(){
        System.out.println("后置测试方法执行");
    }



}
