package org.example.creational.abstractfactory;

public class DatabaseService implements Service {

    @Override
    public String runService() {
        return "Database service running";
    }

}
