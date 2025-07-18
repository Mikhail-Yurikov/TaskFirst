package loggers;

import java.time.LocalDateTime;

public class SmartLogger implements Logger {
    private int count;

    @Override
    public void log(String msg) {
        count++;
        msg = msg.toLowerCase();
        String date = LocalDateTime.now().toString();
        if (msg.contains("error")) {
            System.out.printf("ERROR#%d %s", count, date);
        } else {
            System.out.printf("INFO#%d %s", count, date);
        }
    }
}
