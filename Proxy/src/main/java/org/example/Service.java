package org.example;

public interface Service {
    public void connect();

    public void disconnect();

    public String process(String message);
}
