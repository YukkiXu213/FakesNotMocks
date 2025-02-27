public class FakeExchange implements Exchange {
    @Override
    public float rate(String origin, String target) {
        // Provide a fixed exchange rate for testing purposes
        if (origin.equals("USD") && target.equals("Euro")) {
            return 0.85f; // Assume 1 USD = 0.85 Euro
        }
        return 1.0f; // Default rate for unknown conversions
    }

    @Override
    public String toString() {
        return "FakeExchange";
    }
}