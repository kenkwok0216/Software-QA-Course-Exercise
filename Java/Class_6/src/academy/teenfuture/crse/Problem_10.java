package academy.teenfuture.crse;

import academy.teenfuture.crse.problem_10.Car;

public class Problem_10 {
	public static void main(String[] args) {
		Car car = new Car("Honda", "Civic", 2016);

		System.out.println("Make: " + car.getMake());
		System.out.println("Model: " + car.getModel());
		System.out.println("Year: " + car.getYear());

		int currentYear = 2024;
		System.out.println("Car Age: " + car.calculateAge(currentYear) + " years");

		car.setYear(2019);
		System.out.println("Updated Year: " + car.getYear());
		System.out.println("Updated Car Age: " + car.calculateAge(currentYear) + " years");

	}
}