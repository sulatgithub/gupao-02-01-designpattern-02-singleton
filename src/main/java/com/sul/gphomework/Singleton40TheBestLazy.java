package com.sul.gphomework;

public class Singleton40TheBestLazy {

    private Singleton40TheBestLazy() {
        if(Holder.INSTANCE !=null){
            throw new RuntimeException("Error!!!");
        }
    }

    public static final Singleton40TheBestLazy getInstance() {
        return Holder.INSTANCE;
    }

    private static class Holder {
        private static final Singleton40TheBestLazy INSTANCE = new Singleton40TheBestLazy();
    }
}
