package _31_super_keyword;

public class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "Name: " + this.name + ", Age: " + this.age;
	}
}
