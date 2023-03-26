package org.example;

public class Main {
    public static void main(String[] args) {
        Service service = new ServiceProxy();
        service.connect();
        System.out.println(service.process("Hey"));
    }
}