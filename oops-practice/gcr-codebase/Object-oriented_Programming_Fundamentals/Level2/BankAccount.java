class BankAccount {

    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited : " + amt);
    }

    void withdraw(double amt) {

        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn : " + amt);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void displayBalance() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance : " + balance);
    }

    public static void main(String[] args) {

        BankAccount b = new BankAccount("Ashutosh", 12345, 10000);

        b.displayBalance();
        b.deposit(5000);
        b.withdraw(3000);
        b.displayBalance();
    }
}