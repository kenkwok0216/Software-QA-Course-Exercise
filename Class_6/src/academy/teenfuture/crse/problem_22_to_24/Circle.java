package academy.teenfuture.crse.problem_22_to_24;

public class Circle implements Shape {
	@Override
	public double getArea(double radius) {
		return Math.PI * Math.pow(radius, 2);
	}
}
