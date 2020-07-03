package com.zey.singleton;

/**
 * 双重检测
 * 延迟加载，高并发，实现稍复杂
 */
public class Manager3 {

    /**
     * jdk低版本需要加volatile关键字防止指令重排，目前的jdk都已经不需要，
     * new操作和初始化操作已经是原子操作，禁止重排序
     */
    private static Manager3 INSTANCE;

    private Manager3() {
    }

    public static Manager3 getInstance() {
        if (INSTANCE == null) {
            //加类锁，保证线程安全
            synchronized (Manager3.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Manager3();
                }
            }
        }
        return INSTANCE;
    }
}
