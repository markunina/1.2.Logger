import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    protected int num = 1;
    private static Logger logger;

    private Logger() {}

    public void log(String msg) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yy HH.mm.ss");
        String time = dtf.format(LocalDateTime.now() );
        System.out.println("[" + time + " " + num++ + "] " + msg);
    }

    public static Logger getInstance() {
        if(logger == null){
            logger = new Logger();
        }
        return logger;
    }
}