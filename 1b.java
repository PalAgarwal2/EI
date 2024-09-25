// Singleton Logger Class
class Logger {
    // Static instance variable that will hold the single instance of Logger
    private static Logger instance;

    // Private constructor to prevent instantiation from outside the class
    private Logger() {}

    // Static method to provide access to the single instance of Logger
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Method to log a message
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

// Main class to test the Singleton Pattern
class SingletonPatternDemo {
    public static void main(String[] args) {
        // Getting the singleton instance of Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Logging a message
        logger1.log("This is the first log message.");

        // Checking if both logger instances are the same
        if (logger1 == logger2) {
            System.out.println("Logger is a singleton instance.");
        } else {
            System.out.println("Logger is NOT a singleton instance.");
        }
    }
}
