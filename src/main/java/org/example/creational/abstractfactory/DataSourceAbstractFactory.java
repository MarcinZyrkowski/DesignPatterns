package org.example.creational.abstractfactory;

public interface DataSourceAbstractFactory {

    Service createService();

    Response createResponse();
}
