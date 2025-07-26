package java_oops_tasks;
 //task 3

class Bank
{
    String accountNumber;  
    private double balance; 
    
    public void deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
            System.out.println("Deposited :" + amount);
        } else 
        {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew :" + amount);
        } else {
            System.out.println("Insufficient balance :");
        }
    }
    public double getBalance()
    {
        return balance;
    }

}
public class Bankaccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank acc = new Bank();
		acc.deposit(100000);
		acc.withdraw(20000);
		System.out.println("Remaining balance :"+acc.getBalance());
	}

}
