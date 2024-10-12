package academy.teenfuture.crse;

import academy.teenfuture.crse.problem_09.Square;

public class Problem_09 {
	public static void main(String[] args) {
		Square square = new Square(4);

		System.out.println("Side Length: " + square.getSideLength());
		System.out.println("Area of Square: " + square.getAreaOfSquare());

		square.setSideLength(5);
		System.out.println("New Side Length: " + square.getSideLength());
		System.out.println("New Area of Square: " + square.getAreaOfSquare());

	}
}
