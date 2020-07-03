package com.zey.singleton;

/**
 * 饿汉式
 * 简单好用，不支持延迟加载
 * 线程安全
 */
public class Manager {

    private static final Manager INSTANCE = new Manager();

    private Manager() {
    }

    public static Manager getInstance() {
        return INSTANCE;
    }
}
