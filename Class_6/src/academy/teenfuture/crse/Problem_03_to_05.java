package academy.teenfuture.crse;

import academy.teenfuture.crse.problem_03_to_05.Cat;
import academy.teenfuture.crse.problem_03_to_05.Dog;

public class Problem_03_to_05 {
	public static void main(String[] args) {
		Dog dog = new Dog("Buddy", "Golden Retriever");
		Cat cat = new Cat("Whiskers");

		System.out.println(dog.getName() + " says: " + dog.speak());
		System.out.println("Breed: " + dog.getBreed());

		System.out.println(cat.getName() + " says: " + cat.speak());
	}
}