package org.example.structural.facade;

public class NetworkAccessFacade {

    private final Comm comm = new Comm();
    private final Cache cache = new Cache();
    private final Interceptor interceptor = new Interceptor();
    private final Convertor conv = new Convertor();

    public void communicate() {
        cache.cache();
        comm.send("Some data");
        comm.receive();
        interceptor.intercept();
        conv.convert();
    }
}
