package academy.teenfuture.crse.problem_14_to_16;

public class GrandChild extends Child {
	private String hobby;

	public GrandChild(String name, int age, String hobby) {
		super(name, age);
		this.hobby = hobby;
	}

	public void printHobby() {
		System.out.println("Hobby: " + hobby);
	}
}
