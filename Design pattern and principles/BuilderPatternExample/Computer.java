public class Computer {
    // Required parameters
    private final String CPU;
    private final String RAM;

    // Optional parameters
    private final String storage;
    private final boolean hasGraphicsCard;
    private final boolean hasBluetooth;

    // Private constructor so Computer can only be created via the Builder
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.hasGraphicsCard = builder.hasGraphicsCard;
        this.hasBluetooth = builder.hasBluetooth;
    }

    // Getters
    public String getCPU() { return CPU; }
    public String getRAM() { return RAM; }
    public String getStorage() { return storage; }
    public boolean hasGraphicsCard() { return hasGraphicsCard; }
    public boolean hasBluetooth() { return hasBluetooth; }

    @Override
    public String toString() {
        return "Computer Specifications:\n" +
               "- CPU: " + CPU + "\n" +
               "- RAM: " + RAM + "\n" +
               "- Storage: " + (storage != null ? storage : "Not Specified") + "\n" +
               "- Graphics Card: " + (hasGraphicsCard ? "Enabled" : "Disabled") + "\n" +
               "- Bluetooth: " + (hasBluetooth ? "Enabled" : "Disabled") + "\n";
    }

    // Static Nested Builder Class
    public static class Builder {
        // Required parameters
        private final String CPU;
        private final String RAM;

        // Optional parameters - initialized to default values
        private String storage = "256GB SSD"; 
        private boolean hasGraphicsCard = false;
        private boolean hasBluetooth = false;

        // Constructor for Builder requires the mandatory attributes
        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        // Setter methods for optional parameters that return the Builder instance
        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(boolean hasGraphicsCard) {
            this.hasGraphicsCard = hasGraphicsCard;
            return this;
        }

        public Builder setBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        // The final build method that constructs the actual Computer object
        public Computer build() {
            return new Computer(this);
        }
    }
}