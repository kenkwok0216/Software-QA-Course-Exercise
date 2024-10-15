package academy.teenfuture.crse.problem_22_to_24;

public class Square implements Shape {
	@Override
	public double getArea(double sideLength) {
		return Math.pow(sideLength, 2);
	}
}
