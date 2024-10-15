package academy.teenfuture.crse.problem_18;

public class Converter {

	public double convert(double Celsius) {
		return ((9.0 / 5.0) * Celsius + 32);
	}

	public String convert(int number) {
		return Integer.toBinaryString(number);
	}

}