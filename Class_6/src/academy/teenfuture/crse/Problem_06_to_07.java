package academy.teenfuture.crse;

import academy.teenfuture.crse.problem_06_to_07.BankAccount;
import academy.teenfuture.crse.problem_06_to_07.SavingsAccount;

public class Problem_06_to_07 {
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount(1000.0, 0.03);

		System.out.println("Bank Account Balance: " + bankAccount.getBalance());

		bankAccount.deposit(200.0);
		System.out.println("After Deposit: " + bankAccount.getBalance());

		bankAccount.withdraw(100.0);
		System.out.println("After Withdrawal: " + bankAccount.getBalance());

		bankAccount.withdraw(1700.0);

		SavingsAccount savingsAccount = new SavingsAccount(1900.0, 0.05);

		System.out.println("\nSavings Account Balance: " + savingsAccount.getBalance());

		savingsAccount.addInterest();
		System.out.println("After Adding Interest: " + savingsAccount.getBalance());

		savingsAccount.withdraw(300.0);
		System.out.println("After Withdrawal: " + savingsAccount.getBalance());

		if (savingsAccount.isBelowMinBalance()) {
			System.out.println("Savings Account: Balance is below minimum balance.");
		} else {
			System.out.println("Savings Account: Balance is above minimum balance.");
		}

		savingsAccount.withdraw(700.0);
		System.out.println("After Withdrawal: " + savingsAccount.getBalance());

		if (savingsAccount.isBelowMinBalance()) {
			System.out.println("Savings Account: Balance is below minimum balance.");
		} else {
			System.out.println("Savings Account: Balance is above minimum balance.");
		}
	}
}