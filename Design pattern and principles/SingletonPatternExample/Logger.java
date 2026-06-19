public class Logger {
    // Step 2: Private static instance of itself
    private static Logger instance;

    // Step 2: Private constructor prevents instantiation from other classes
    private Logger() {
        System.out.println("Logger initialized successfully.");
    }

    // Step 2: Public static method to get the single instance
    public static Logger getInstance() {
        // Step 3: Lazy initialization logic
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Example logging method to simulate real utility usage
    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}
