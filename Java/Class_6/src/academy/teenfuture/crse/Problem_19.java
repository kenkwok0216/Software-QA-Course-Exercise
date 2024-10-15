package academy.teenfuture.crse;

import academy.teenfuture.crse.problem_19.Person;
import academy.teenfuture.crse.problem_19.Student;

public class Problem_19 {
	public static void main(String[] args) {
		Person person = new Person();
		person.greet(); // Output: Hello!

		Student student = new Student();
		student.greet(); // Output: Hi, Teacher!

		// Polymorphism example
		Person polyStudent = new Student();
		polyStudent.greet(); // Output: Hi, Teacher!
	}
}
