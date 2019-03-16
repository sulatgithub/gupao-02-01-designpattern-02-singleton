package com.sul.gphomework;

public class Singleton50Localthread {
    private static ThreadLocal<Singleton50Localthread> threadLocal =
            new ThreadLocal<Singleton50Localthread>(){

                @Override
                protected Singleton50Localthread initialValue() {
                    return new Singleton50Localthread();
                }
            };
    public static Singleton50Localthread getInstance() {
        return threadLocal.get();
    }
}
