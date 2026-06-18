public class InterestCalculator {

    public static double interest(double a, double r, int y)
            throws IllegalArgumentException {

        if (a < 0 || r < 0) {
            throw new IllegalArgumentException();
        }
        return (a * r * y) / 100;
    }

    public static void main(String[] args) {

        try {
            System.out.println(interest(10000, 5, 2));

        } catch (IllegalArgumentException e) {
            System.out.println(
                    "Invalid input: Amount and rate must be positive");
        }
    }
}