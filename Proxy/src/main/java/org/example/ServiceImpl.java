package org.example;

public class ServiceImpl implements Service{
    @Override
    public void connect() {
        return;
    }

    @Override
    public void disconnect() {
        return;
    }

    @Override
    public String process(String message) {
        return "Service got: {"  + message + "}";
    }
}
