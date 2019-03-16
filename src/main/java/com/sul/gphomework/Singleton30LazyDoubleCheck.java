package com.sul.gphomework;

public class Singleton30LazyDoubleCheck {
    //私有静态实例
    private static volatile Singleton30LazyDoubleCheck instance = null;

    //私有构造方法
    private Singleton30LazyDoubleCheck() {

    }

    public static Singleton30LazyDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (Singleton30LazyDoubleCheck.class) {
                if (instance == null) {
                    instance = new Singleton30LazyDoubleCheck();
                }
            }
        }
        return instance;
    }

    public void method1 () {
        System.out.println(this.getClass().getSimpleName()+":method1");
    }
}
