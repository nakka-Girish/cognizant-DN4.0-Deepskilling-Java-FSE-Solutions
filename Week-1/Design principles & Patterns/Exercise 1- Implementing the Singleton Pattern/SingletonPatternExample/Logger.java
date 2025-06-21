public class Logger {
    private static Logger instance;
    private Logger() {    
        System.out.println("Logger initialized through constructor");
    }
    public static Logger getInstanceOf_Logger() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    public void log_Msg(String message) {
        System.out.println(message);
    }
}