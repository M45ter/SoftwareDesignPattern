package com.zey.singleton;

/**
 * 懒汉式
 * 延迟加载，并发度低，性能差
 */
public class Manager2 {

    private static Manager2 INSTANCE;

    private Manager2() {
    }

    //为了线程安全，加了synchronized并发度降低
    public static synchronized Manager2 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Manager2();
        }
        return INSTANCE;
    }
}
