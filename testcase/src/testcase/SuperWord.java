package testcase;
class Person{
	int i=10;
	Person(){
		System.out.println("I am Aisharya");
	}
	public void display() {
		System.out.println("I am person");
	}
	
}
class Student extends Person{
	Student(){
		super();
		System.out.println("My name is Aisharya");
	}
	public void display() {
		System.out.println("I am student");
		System.out.println(super.i);
		super.display();
	}

}

public class SuperWord {

	public static void main(String[] args) {

Student s= new Student();
s.display();
	}

}
