package a.classes.efenition;

public class person {

	// TODO Auto-generated method stub

	private int id;
	String name;
	private int age;

	public void setAge(int age) {
		// the keyword 'this' is a reference to the currect object.
		if (age >= 0 && age <= 120) {
			this.age = age;
		}
	}

	public int getAge() {
		return this.age;
	}

	void speak() {
		System.out.println(name + " says: bla bla");

	}

	void walk() {
		System.out.println(name + " is walking");

	}
}
