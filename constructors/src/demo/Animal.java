package demo;
//super key word
//overriding
class AnimalApp {
	int age;
	public void eat() {
		System.out.println("animals eat food");
	}
}

class Cats extends AnimalApp{
	String color = "white";
	public void eat() {
		super.eat();
		System.out.println("cats drink milk");
		System.out.println(+age);
	}
}

public class Animal{
	public static void main(String args[]) {
		AnimalApp a = new AnimalApp();
		a.eat();
		Cats c = new Cats();
		c.eat();	
	}	
}
