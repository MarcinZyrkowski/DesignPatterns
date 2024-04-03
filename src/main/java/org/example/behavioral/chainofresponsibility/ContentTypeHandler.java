package org.example.behavioral.chainofresponsibility;

public class ContentTypeHandler implements HandlerChain {

    public HandlerChain next;
    String contentType;

    public ContentTypeHandler(String contentType) {
        this.contentType = contentType;
    }

    @Override
    public String addHandler(String inputHeader) {
        String outputHeader = inputHeader + "\nContentType: " + contentType;
        if (next == null) {
            return outputHeader;
        } else {
            return next.addHandler(outputHeader);
        }
    }

}
