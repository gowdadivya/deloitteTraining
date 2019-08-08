package demo;

public class Doctors {
	String doctorName;
	int fees;
	static int noOfObjects = 0;
	public Doctors() {
		noOfObjects++;
	}
	public Doctors(int fees) {
		noOfObjects++;
		this.fees=fees;
	}
	public Doctors(String doctorName) {
		noOfObjects++;
		this.doctorName=doctorName;
	}
	public Doctors(int fees, String doctorName) {
		noOfObjects++;
		this.fees=fees;
		this.doctorName=doctorName;
	}
	
	public void print() {
		System.out.println("Number of objects are : "+noOfObjects);
	}
	public static void main (String args[]) {
		Doctors d1 = new Doctors();
		d1.print();
		Doctors d2 = new Doctors(12000, "isha");
		d2.print();
		Doctors d3 = new Doctors("adya");
		d3.print();
		Doctors d4 = new Doctors(16000);
		d4.print();
	}
}
