package academy.teenfuture.crse.problem_06_to_07;

public class SavingsAccount extends BankAccount {
	private double minBalance = 1000;

	public SavingsAccount(double balance, double interestRate) {
		super(balance, interestRate);
	}

	public void addInterest() {
		double interest = getBalance() * getInterestRate();
		deposit(interest);
	}

	public boolean isBelowMinBalance() {
		return (getBalance() < minBalance);
	}
}
