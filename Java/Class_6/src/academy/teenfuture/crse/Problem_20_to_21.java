package academy.teenfuture.crse;

import academy.teenfuture.crse.problem_20_to_21.Animal;
import academy.teenfuture.crse.problem_20_to_21.Dog;

public class Problem_20_to_21 {
	public static void main(String[] args) {
		Animal dog = new Dog(); // Create a Dog object as an Animal
		dog.makeSound(); // Call the makeSound method, output: "Woof!"
	}
}