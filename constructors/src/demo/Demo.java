package demo;

public class Demo {
	int i = 100;
	public Demo() {
		System.out.println("default constructor");
	}
	public Demo(int num) {
		i = num;
		System.out.println("parametrized constructor");
	}
	public void display() {
		System.out.println(i);
	}
	public static void main (String args[]) {
		Demo d = new Demo();
		d.display();
		Demo d1 = new Demo(10);
		d1.display();	
	}

}
