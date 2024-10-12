package academy.teenfuture.crse.problem_14_to_16;

public class Child extends Parent {
	private int age;

	public Child(String name, int age) {
		super(name);
		this.age = age;
	}

	public void printAge() {
		System.out.println("Age: " + age);
	}
}