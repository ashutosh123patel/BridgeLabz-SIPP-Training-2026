
public class BankAccount {

    String accountNumber;
    String accountholder;
    int balance;

    BankAccount(String accountNumber, String accountholder, int balance){
        this.accountNumber = accountNumber;
        this.accountholder = accountholder;
        this.balance = balance;
    }

    public static void display(){
        System.out.println("Indian Overseas Bank");
    }

    public void deposit(double amount) {
		if(amount > 0) {
			balance+=amount;
			System.out.println(" Aap ka Amount Deposit ho gaya : "+amount);
		}
		else {
			System.out.println("amount deposited should be positive");
		}
	}
	
	

	public void withdraw(double amount) {
		if (amount <= balance && amount > 0) {
			balance -= amount;
			System.out.println("Withdraw amount is : "+amount);
		}
		else if (amount <= 0) {
			System.out.println("Withdrawal amount must be positive");
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	
	
   public void displayBalance() {
       System.out.println("Current balance: " + balance);
   }

    public static void main(String[] args) {
        display();
        BankAccount myaccount1 = new BankAccount("145652201", "Ashutosh Patel", 2400);
        //BankAccount myaccount2 = new BankAccount("145652202", "Abhishek Patel", 2400);
        //BankAccount myaccount3 = new BankAccount("145652203", "Neha Gupta", 2400);
        myaccount1.displayBalance();

        myaccount1.deposit(3200);
        myaccount1.displayBalance();

        myaccount1.withdraw(1200);
       myaccount1.displayBalance();
        
    }
}
