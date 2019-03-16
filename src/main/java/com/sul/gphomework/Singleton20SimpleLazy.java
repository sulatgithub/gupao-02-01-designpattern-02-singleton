package com.sul.gphomework;

public class Singleton20SimpleLazy {
    private static Singleton20SimpleLazy instance = null;

    private Singleton20SimpleLazy(){

    }

    public static Singleton20SimpleLazy getInstance() {
        if (instance == null) {
            instance = new Singleton20SimpleLazy();
        }
        return instance;
    }
}
