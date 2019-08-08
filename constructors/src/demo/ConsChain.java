package demo;

import java.rmi.server.SocketSecurityException;

public class ConsChain {
	int StudentID;
	String studentName;
	int marks;
	int fees;
	public ConsChain() {
		int StudentID = 0;
		String studentName = "NA";
		int marks = 50;
		int fees = 80000;
		System.out.println();
		}
	public ConsChain(int studentID, String studentName, int marks, int fees) {
		this();
		StudentID = studentID;
		this.studentName = studentName;
		this.marks = marks;
		this.fees = fees;
	}
	public ConsChain(String studentName, int marks, int fees) {
		this.studentName = studentName;
		this.marks = marks;
		this.fees = fees;
	}	
	public ConsChain(int marks, int fees) {
		this.marks = marks;
		this.fees = fees;
	}
	public ConsChain(int fees) {
		this.fees = fees;
	}
	public static void main(String[] args) {
		
		
		
	}
}
