package org.example;

public class ServiceProxy implements Service{
    private volatile Service service = null;
    private int connections = 0;
    private static final Integer mutex = 1;
    @Override
    public void connect() {
        connections += 1;
    }

    @Override
    public void disconnect() {
        connections -= 1;
        if(connections == 0) {
            service = null;
        }
    }

    @Override
    public String process(String message) {
        if (service == null) {
            synchronized (mutex) {
                if (service == null) {
                    service = new ServiceImpl();
                }
            }
        }
        message = "Client said: {" + message + "}";
        return service.process(message);
    }
}
