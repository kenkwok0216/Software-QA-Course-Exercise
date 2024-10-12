package academy.teenfuture.crse.problem_08;

public class Circle {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double getCircumference() {
		return Math.PI * 2 * radius;
	}

}