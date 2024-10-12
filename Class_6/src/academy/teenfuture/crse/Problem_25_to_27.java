package academy.teenfuture.crse;

import academy.teenfuture.crse.problem_25_to_27.Car;
import academy.teenfuture.crse.problem_25_to_27.Motorcycle;
import academy.teenfuture.crse.problem_25_to_27.Vehicle;

public class Problem_25_to_27 {
	public static void main(String[] args) {
		// Create instances of Car and Motorcycle
		Vehicle myCar = new Car();
		Vehicle myMotorcycle = new Motorcycle();

		// Simulate driving each vehicle
		myCar.drive(); // Output: Driving a car
		myMotorcycle.drive(); // Output: Riding a motorcycle
	}
}