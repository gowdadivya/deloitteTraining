package demo;
public class ObjectClass{
	public static void main(String[] args) {
		Employee e1 = new Employee(100, "shivani");
		Employee e2 = new Employee(100, "shivani");
		Employee e3 = e1;
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e1==e2);
		System.out.println(e1==e3);
	}
	
}
class Employee{
	int EId;
	String EName;
	public Employee() {
		
	}
	public Employee(int eId, String eName) {
		super();
		EId = eId;
		EName = eName;
	}
	
}
