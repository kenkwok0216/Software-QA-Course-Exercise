package academy.teenfuture.crse;

import academy.teenfuture.crse.problem_08.Circle;

public class Problem_08 {
	public static void main(String[] args) {
		Circle circle = new Circle(5);

		System.out.println("Radius: " + circle.getRadius());
		System.out.printf("Circumference: %.2f\n", circle.getCircumference());

		circle.setRadius(10);
		System.out.println("New Radius: " + circle.getRadius());
		System.out.printf("New Circumference: %.2f\n", circle.getCircumference());
	}
}