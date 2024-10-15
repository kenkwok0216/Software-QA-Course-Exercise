package academy.teenfuture.crse.problem_03_to_05;

public class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}

	@Override
	public String speak() {
		return "Meow";
	}
}