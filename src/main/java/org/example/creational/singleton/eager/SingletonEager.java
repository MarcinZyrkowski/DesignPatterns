package org.example.creational.singleton.eager;

public class SingletonEager {

    private static final SingletonEager eagerInstance = new SingletonEager();

    private SingletonEager() {

    }

    public static SingletonEager getEagerInstance() {
        return eagerInstance;
    }
}