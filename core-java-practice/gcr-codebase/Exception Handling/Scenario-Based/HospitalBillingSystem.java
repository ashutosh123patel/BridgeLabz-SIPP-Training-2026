import java.util.Scanner;

class InsufficientFundsException extends Exception {

    InsufficientFundsException(String s) {
        super(s);
    }
}

public class HospitalBillingSystem {
    public static void payBill(double bal, double bill)
            throws InsufficientFundsException {

        if (bill > bal) {
            throw new InsufficientFundsException(
                    "Payment failed: Insufficient funds");
        }

        System.out.println("Payment Successful");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            int items = sc.nextInt();
            System.out.println("Average Cost = " + (1000 / items));
            int[] p = {101, 102, 103};

            int idx = sc.nextInt();
            System.out.println("Patient Id = " + p[idx]);
            String s = sc.next();
            int age = Integer.parseInt(s);

            System.out.println("Age = " + age);

            payBill(5000, 6000);

        } catch (ArithmeticException e) {
            System.out.println("Bill items cannot be zero");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid patient index");

        } catch (NumberFormatException e) {

            System.out.println("Invalid numeric input");

        } catch (InsufficientFundsException e) {

            System.out.println(e.getMessage());
        }
    }
}