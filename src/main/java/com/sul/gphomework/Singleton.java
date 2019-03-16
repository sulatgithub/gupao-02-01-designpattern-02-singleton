package com.sul.gphomework;

public class Singleton {
    //私有静态实例
    private static Singleton instance = null;

    //私有构造方法
    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void method1 () {
        System.out.println(this.getClass().getSimpleName()+":method1");
    }
}
