package academy.teenfuture.crse;

import academy.teenfuture.crse.problem_22_to_24.Circle;
import academy.teenfuture.crse.problem_22_to_24.Shape;
import academy.teenfuture.crse.problem_22_to_24.Square;

public class Problem_22_to_24 {
	public static void main(String[] args) {
		// Create a Circle object
		Shape circle = new Circle();
		double circleRadius = 5.0;
		double circleArea = circle.getArea(circleRadius);
		System.out.printf("Area of the circle with radius %.2f: %.2f%n", circleRadius, circleArea);

		// Create a Square object
		Shape square = new Square();
		double squareSideLength = 4.0;
		double squareArea = square.getArea(squareSideLength);
		System.out.printf("Area of the square with side length %.2f: %.2f%n", squareSideLength, squareArea);
	}
}