public class Singleton_Test {
    public static void main(String[] args) {
        Logger log1 = Logger.getInstanceOf_Logger();
        Logger log2 = Logger.getInstanceOf_Logger();

        log1.log_Msg("First logger instance message.");
        log2.log_Msg("Second loger instance  message.");

        if (log1 == log2) {
            System.out.println("Both logger instances are same.");
            System.out.println("Singleton pattern is working.");
        } else {
            System.out.println("Different logger instances.");
            System.out.println("Not singleton class");           
        }
    }
}
