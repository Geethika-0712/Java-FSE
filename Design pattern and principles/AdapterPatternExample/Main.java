public class Main {
    public static void main(String[] args) {
        // 1. Using PayPal through its adapter
        PayPalGateway payPalSDK = new PayPalGateway();
        PaymentProcessor payPalProcessor = new PayPalAdapter(payPalSDK);
        
        // 2. Using Stripe through its adapter
        StripeGateway stripeSDK = new StripeGateway();
        PaymentProcessor stripeProcessor = new StripeAdapter(stripeSDK);

        // 3. Client code runs seamlessly using the uniform interface
        System.out.println("=== Initiating Transactions ===");
        
        payPalProcessor.processPayment(150.00);
        stripeProcessor.processPayment(89.99);
    }
}