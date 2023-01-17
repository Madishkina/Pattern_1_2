import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    private static Logger logger;//В этом поле храним ссылку на тот
    // единственный объект этого класса который будем отдавать пользователям
    protected int num = 1;//для поддержки счётчика сообщений
    // заведите у логгера и инкрементируйте при логгировании числовое поле int num).

    public void log(String msg) {// для логгирования сообщения в консоль нужным форматом
        System.out.println("[" +LocalDateTime.now().format(DateTimeFormatter.
                ofPattern("dd.mm.yyyy HH:mm:ss")) + num+ "] " + msg);
    }
    private String time() {
        return DateTimeFormatter
                .ofPattern("dd.MM.yy hh:mm:ss")
                .format(LocalDateTime.now());
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }

}
