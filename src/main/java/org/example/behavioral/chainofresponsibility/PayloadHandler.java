package org.example.behavioral.chainofresponsibility;

public class PayloadHandler implements HandlerChain {

    public HandlerChain next;
    String payload;

    public PayloadHandler(String payload) {
        this.payload = payload;
    }

    @Override
    public String addHandler(String inputHeader) {
        String outputHeader = inputHeader + "\n" + payload;
        if (next == null) {
            return outputHeader;
        } else {
            return next.addHandler(outputHeader);
        }
    }

}
