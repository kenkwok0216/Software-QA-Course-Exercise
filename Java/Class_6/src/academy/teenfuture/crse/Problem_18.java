package academy.teenfuture.crse;

import academy.teenfuture.crse.problem_18.Converter;

public class Problem_18 {
	public static void main(String[] args) {
		Converter converter = new Converter();

		// Convert Celsius to Fahrenheit
		double celsius = 25.0;
		double fahrenheit = converter.convert(celsius);
		System.out.println(celsius + " °C in Fahrenheit: " + fahrenheit); // Output: 25.0 °C in Fahrenheit: 77.0

		// Convert an integer to a binary string
		int number = 10;
		String binaryString = converter.convert(number);
		System.out.println("Integer: " + number + " in Binary: " + binaryString); // Output: Integer: 10 in Binary: 1010
	}

}