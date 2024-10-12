package academy.teenfuture.crse;

import academy.teenfuture.crse.problem_17.Calculator;

public class Problem_17 {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		// Using the add method with two parameters
		int sum1 = calculator.add(5, 10);
		System.out.println("Sum of 5 and 10: " + sum1); // Output: 15

		// Using the add method with three parameters
		int sum2 = calculator.add(5, 10, 15);
		System.out.println("Sum of 5, 10, and 15: " + sum2); // Output: 30
	}
}