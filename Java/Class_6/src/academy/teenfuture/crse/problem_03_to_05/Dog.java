package academy.teenfuture.crse.problem_03_to_05;

public class Dog extends Animal {
	private String breed;

	public Dog(String name, String breed) {
		// some in c#: public Dog(string name, string breed) : base(name)
		super(name);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	@Override
	public String speak() {
		return "Woof";
	}
}