public class Main {
    public static void main(String[] args) {
        // Request the Logger instance for the first time
        Logger logger1 = Logger.getInstance();
        logger1.log("First log message.");

        // Request the Logger instance for the second time
        Logger logger2 = Logger.getInstance();
        logger2.log("Second log message.");

        // Verify both variables point to the same physical object
        System.out.println("\n--- Verification Results ---");
        System.out.println("Are logger1 and logger2 the exact same instance?");
        System.out.println(logger1 == logger2); 

        // Print memory hash codes to visually confirm
        System.out.println("Logger 1 HashCode: " + logger1.hashCode());
        System.out.println("Logger 2 HashCode: " + logger2.hashCode());
    }
}
