public class StripeGateway {
    public void makeCharge(double amountInDollars, String currency) {
        System.out.println("Charging $" + amountInDollars + " " + currency + " via Stripe Elements API.");
    }
}