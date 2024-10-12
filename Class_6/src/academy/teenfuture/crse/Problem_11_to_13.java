package academy.teenfuture.crse;

import academy.teenfuture.crse.problem_11_to_13.Car;
import academy.teenfuture.crse.problem_11_to_13.SportsCar;
import academy.teenfuture.crse.problem_11_to_13.Vehicle;

public class Problem_11_to_13 {
	public static void main(String[] args) {
		// Create a Vehicle instance
		Vehicle vehicle = new Vehicle("Toyota", "Camry");
		System.out.println("Vehicle Make: " + vehicle.getMake());
		System.out.println("Vehicle Model: " + vehicle.getModel());

		// Create a Car instance
		Car car = new Car("Honda", "Civic", 4);
		System.out.println("\nCar Make: " + car.getMake());
		System.out.println("Car Model: " + car.getModel());
		System.out.println("Number of Doors: " + car.getNumDoors());

		// Create a SportsCar instance
		SportsCar sportsCar = new SportsCar("Ferrari", "488", 2, 211.0);
		System.out.println("\nSports Car Make: " + sportsCar.getMake());
		System.out.println("Sports Car Model: " + sportsCar.getModel());
		System.out.println("Number of Doors: " + sportsCar.getNumDoors());
		System.out.println("Top Speed: " + sportsCar.getTopSpeed() + " mph");

		// Demonstrate polymorphism
		Vehicle myCar = new SportsCar("Porsche", "911", 2, 205.0);
		System.out.println("\nPolymorphic Vehicle Make: " + myCar.getMake());
		System.out.println("Polymorphic Vehicle Model: " + myCar.getModel());

		// Cast back to SportsCar to access specific methods
		if (myCar instanceof SportsCar) {
			SportsCar mySportsCar = (SportsCar) myCar;
			System.out.println("Number of Doors: " + mySportsCar.getNumDoors());
			System.out.println("Top Speed: " + mySportsCar.getTopSpeed() + " mph");
		}
	}
}