import java.util.Arrays;

// --- STEP 3A: PRODUCT CLASS ---
class Product implements Comparable<Product> {
    int productId;
    String productName;
    String category;

    // Constructor
    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    // Helper method to display product info
    @Override
    public String toString() {
        return "Product[ID=" + productId + ", Name='" + productName + "', Category='" + category + "']";
    }

    // Required for sorting products by ID for Binary Search
    @Override
    public int compareTo(Product other) {
        return Integer.compare(this.productId, other.productId);
    }
}

public class SearchProject {

    // --- STEP 3B: LINEAR SEARCH ---
    // Scans every element from start to finish
    public static int linearSearch(Product[] products, int targetId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productId == targetId) {
                return i; // Returns index if found
            }
        }
        return -1; // Returns -1 if not found
    }

    // --- STEP 3B: BINARY SEARCH ---
    // Continually divides the sorted array in half
    public static int binarySearch(Product[] products, int targetId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (products[mid].productId == targetId) {
                return mid; // Target found
            }
            if (products[mid].productId < targetId) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        // Create an array of mock products
        Product[] products = {
            new Product(105, "Wireless Mouse", "Electronics"),
            new Product(101, "Laptop", "Electronics"),
            new Product(103, "Coffee Mug", "Kitchen"),
            new Product(102, "Desk Chair", "Furniture"),
            new Product(104, "Running Shoes", "Apparel")
        };

        int targetId = 103;

        System.out.println("--- Executing Linear Search ---");
        int linearIndex = linearSearch(products, targetId);
        if (linearIndex != -1) {
            System.out.println("Found via Linear Search at index " + linearIndex + ": " + products[linearIndex]);
        } else {
            System.out.println("Product not found.");
        }

        // Binary Search REQUIRES a sorted array
        System.out.println("\n--- Sorting Array for Binary Search ---");
        Arrays.sort(products); 

        System.out.println("--- Executing Binary Search ---");
        int binaryIndex = binarySearch(products, targetId);
        if (binaryIndex != -1) {
            System.out.println("Found via Binary Search at index " + binaryIndex + ": " + products[binaryIndex]);
        } else {
            System.out.println("Product not found.");
        }
    }
}