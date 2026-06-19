public class StripeAdapter implements PaymentProcessor {
    private StripeGateway stripeGateway;

    public StripeAdapter(StripeGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }

    @Override
    public void processPayment(double amount) {
        // Translates 'processPayment' to 'makeCharge' and handles extra parameters
        stripeGateway.makeCharge(amount, "USD");
    }
}