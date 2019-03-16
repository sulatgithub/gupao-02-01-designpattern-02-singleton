package com.sul.gphomework;

public class Singleton10Hungry {
    private static Singleton10Hungry instance = new Singleton10Hungry();

    private Singleton10Hungry() {

    }

    public Singleton10Hungry getInstance(){
        return instance;
    }
}
