public class Main {
    public static void main(String[] args) {
        
        // 1. Building a basic Office Computer (Only mandatory fields + defaults)
        Computer officePC = new Computer.Builder("Intel i3", "8GB")
                .build();

        // 2. Building a high-end Gaming Computer (Customizing optional fields)
        Computer gamingPC = new Computer.Builder("AMD Ryzen 9", "32GB")
                .setStorage("2TB NVMe SSD")
                .setGraphicsCard(true)
                .setBluetooth(true)
                .build();

        // 3. Building a Budget Server (Some options skipped)
        Computer server = new Computer.Builder("Intel Xeon", "64GB")
                .setStorage("4TB HDD")
                // Graphics card and bluetooth default to false
                .build();

        // Print configurations to console
        System.out.println("=== OFFICE PC ===");
        System.out.println(officePC);

        System.out.println("=== GAMING PC ===");
        System.out.println(gamingPC);

        System.out.println("=== SERVER ===");
        System.out.println(server);
    }
}