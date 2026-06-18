class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(double bal, double amt) {

        super("Balance = ₹" + bal +
              ", Requested = ₹" + amt);
    }
}
public class ATMSystem {

    public static void withdraw(double bal, double amt)
            throws InsufficientBalanceException {
        if (amt > bal) {
            throw new  InsufficientBalanceException(
                    bal, amt);
        }

        System.out.println("Withdrawal   Successful");
    }

    public static void main(String[] args) {
        double bal =  5000;
        double amt  = 8000;

        try {
            withdraw(bal, amt);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}