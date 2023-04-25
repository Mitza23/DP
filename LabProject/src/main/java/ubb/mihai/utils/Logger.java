package ubb.mihai.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class Logger {
    DateTimeFormatter dtf;
    volatile private static Logger instance = null;
    private static final Integer obj= 1;

    public void log(String message) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.toString() + " -> " + message);
    }

    private Logger() {
        dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    }

    public static Logger getInstance() {
        if(instance !=null) {
            return instance;
        }
        synchronized(obj) {
            if (instance == null) {
                instance = new Logger();
            }
            return instance;
        }
    }
}
