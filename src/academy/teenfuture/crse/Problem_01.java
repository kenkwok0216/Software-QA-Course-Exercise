package academy.teenfuture.crse;

import academy.teenfuture.crse.problem_01.Person;

public class Problem_01 {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30, "Female");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
        person.setName("Bob");
        person.setAge(35);
        person.setGender("Male");
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());
        System.out.println("Updated Gender: " + person.getGender());
    }
}
