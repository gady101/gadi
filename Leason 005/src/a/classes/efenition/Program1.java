package a.classes.efenition;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("=== start ");
		person p1 = new person();
		p1.name = "dor";
		p1.speak();

		System.out.println(" age: " + p1.getAge());
		p1.setAge(30);

		System.out.println(" age: " + p1.getAge());
		System.out.println(" ==== stop ");

	}

}
