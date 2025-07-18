package loggers;

import java.time.LocalDateTime;

public class SimpleLogger implements Logger {
    @Override
    public void log(String msg) {
        String date = LocalDateTime.now().toString();
        System.out.printf("%s %s", date, msg);
    }
}
