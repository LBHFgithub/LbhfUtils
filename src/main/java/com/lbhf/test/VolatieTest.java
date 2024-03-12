package com.lbhf.test;

public class VolatieTest {
    private volatile static VolatieTest uniqueVolatieTes;

    public static VolatieTest getVolatieTest(){
        if (uniqueVolatieTes == null){
            synchronized (VolatieTest.class){
                uniqueVolatieTes = new VolatieTest();
            }
        }
        return uniqueVolatieTes;
    }
}
