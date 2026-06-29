public class FinancialForecasting {

    /**
     * Calculates future value using a recursive approach.
     * * @param presentValue The starting amount of money
     * @param growthRate   The annual growth rate (e.g., 0.05 for 5%)
     * @param years        The number of years to forecast
     * @return The predicted future value
     */
    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        // STEP 1: BASE CASE
        // If no years are left, the future value is just the current value.
        if (years <= 0) {
            return presentValue;
        }

        // STEP 2: RECURSIVE CASE
        // Calculate the value for next year
        double nextYearValue = presentValue * (1 + growthRate);

        // Recursively call the method, reducing the years by 1
        return calculateFutureValue(nextYearValue, growthRate, years - 1);
    }

    public static void main(String[] args) {
        double initialInvestment = 1000.0; // $1,000
        double annualRate = 0.07;          // 7% growth rate
        int forecastPeriod = 5;            // 5 years

        System.out.println("--- Financial Forecasting Tool ---");
        System.out.printf("Initial Investment: $%.2f%n", initialInvestment);
        System.out.printf("Annual Growth Rate: %.1f%%%n", annualRate * 100);
        System.out.println("Forecasting for " + forecastPeriod + " years...\n");

        double projectedValue = calculateFutureValue(initialInvestment, annualRate, forecastPeriod);

        System.out.printf("Predicted Future Value: $%.2f%n", projectedValue);
    }
}