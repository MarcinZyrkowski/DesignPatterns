package org.example.creational.singleton.billpugh;

public class SingletonBillPugh {

    private SingletonBillPugh() {

    }

    public static SingletonBillPugh getInstance() {
        return InnerStaticClass.billPughInstance;
    }

    private static class InnerStaticClass {

        private static final SingletonBillPugh billPughInstance = new SingletonBillPugh();
    }

}
