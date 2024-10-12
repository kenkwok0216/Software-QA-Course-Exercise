package academy.teenfuture.crse;

import academy.teenfuture.crse.problem_02.Rectangle;

public class Problem_02 {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(5, 10);
		System.out.println("Length: " + rectangle.getLength());
		System.out.println("Width: " + rectangle.getWidth());
		System.out.println("Area: " + rectangle.findArea());
		rectangle.setLength(7);
		rectangle.setWidth(3);
		System.out.println("New Area: " + rectangle.findArea());
	}
}
