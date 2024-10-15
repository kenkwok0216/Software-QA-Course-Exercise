package academy.teenfuture.crse.problem_03_to_05;

public class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public String speak() {
		return "some animal sound";
	}

	public String getName() {
		return name;
	}
}