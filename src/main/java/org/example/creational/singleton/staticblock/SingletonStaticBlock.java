package org.example.creational.singleton.staticblock;

public class SingletonStaticBlock {

    private static final SingletonStaticBlock instance;

    static {
        instance = new SingletonStaticBlock();
    }

    private SingletonStaticBlock() {

    }

    public static SingletonStaticBlock getInstance() {
        return instance;
    }
}
