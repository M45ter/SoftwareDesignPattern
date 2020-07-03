package com.zey.singleton;

/**
 * 枚举
 * 延迟加载，高并发，简单，**不可反射创建实例**
 */
public enum Manager5 {
    INSTANCE;

    public static void main(String[] args) {
        Manager5 o1 = Manager5.INSTANCE;
        Manager5 o2 = Manager5.INSTANCE;
        System.out.println(o1 == o2);
    }
}
