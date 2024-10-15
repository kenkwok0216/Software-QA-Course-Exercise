package academy.teenfuture.crse;

import academy.teenfuture.crse.problem_14_to_16.Child;
import academy.teenfuture.crse.problem_14_to_16.GrandChild;
import academy.teenfuture.crse.problem_14_to_16.Parent;

public class Problem_14_to_16 {
	public static void main(String[] args) {
		// Create a Parent instance
		Parent parent = new Parent("John Doe");
		parent.printName(); // Output the parent's name

		// Create a Child instance
		Child child = new Child("Jane Doe", 12);
		child.printName(); // Output the child's name (inherited from Parent)
		child.printAge(); // Output the child's age

		// Create a Grandchild instance
		GrandChild grandchild = new GrandChild("Alice", 8, "Drawing");
		grandchild.printName(); // Output the grandchild's name (inherited from Parent)
		grandchild.printAge(); // Output the grandchild's age (inherited from Child)
		grandchild.printHobby(); // Output the grandchild's hobby
	}
}