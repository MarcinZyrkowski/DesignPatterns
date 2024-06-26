package org.example.creational.singleton.lazy;

public class SingletonLazy {

    private static SingletonLazy lazyInstance;

    private SingletonLazy() {

    }

    public static SingletonLazy getInstance() {
        if (lazyInstance == null) {
            lazyInstance = new SingletonLazy();
        }

        return lazyInstance;
    }
}