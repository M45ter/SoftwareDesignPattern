package com.zey.singleton;

/**
 * 静态内部类
 * 延迟加载，高并发，简单
 */
public class Manager4 {

    private Manager4() {
    }

    private static class SingletonHolder {
        private static final Manager4 INSTANCE = new Manager4();
    }

    public static Manager4 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
