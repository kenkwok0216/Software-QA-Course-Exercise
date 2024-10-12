package academy.teenfuture.crse.problem_06_to_07;

public class BankAccount {
	private double balance;
	private double interestRate;

	public BankAccount(double initialBalance, double interestRate) {
		this.balance = initialBalance;
		this.interestRate = interestRate;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Not enough balance");
		}
	}
}