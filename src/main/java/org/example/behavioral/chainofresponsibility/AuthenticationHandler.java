package org.example.behavioral.chainofresponsibility;

public class AuthenticationHandler implements HandlerChain {

    public HandlerChain next;
    String token;

    public AuthenticationHandler(String token) {
        this.token = token;
    }

    @Override
    public String addHandler(String inputHeader) {
        String outputHeader = inputHeader + "\nAuthentication: " + token;
        if (next == null) {
            return outputHeader;
        } else {
            return next.addHandler(outputHeader);
        }
    }

}
