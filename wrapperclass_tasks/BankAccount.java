package wrapperclass_tasks;

// task 8 wrapper class

public class BankAccount
{

	private String accountNumber;
    private Double balance;

    public BankAccount(String accountNumber, Double balance) //constructor
    {
        this.accountNumber = accountNumber;
        this.balance = (balance == null) ? 0.0 : balance;
    }

    public void deposit(double amount)
    {
        if (amount > 0) 
        {
            balance += amount; 
        }
    }

    public void withdraw(double amount) 
    {
        if (amount > 0 && balance >= amount)
        {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public void showBalance()
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BankAccount account = new BankAccount("123456789", null);
	        account.showBalance(); 
	        account.deposit(15000.0);
	        account.withdraw(5000.0);
	        account.showBalance(); 
	}

}

    