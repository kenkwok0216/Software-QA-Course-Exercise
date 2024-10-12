package academy.teenfuture.crse.problem_11_to_13;

public class SportsCar extends Car {
	private double topSpeed;

	public SportsCar(String make, String model, int numDoors, double topSpeed) {
		super(make, model, numDoors);
		this.topSpeed = topSpeed;
	}

	public double getTopSpeed() {
		return topSpeed;
	}

}