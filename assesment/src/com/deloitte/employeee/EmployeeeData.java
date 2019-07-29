package com.deloitte.employeee;

import java.util.List;
import java.util.Scanner;

import com.deloitte.emp.dao.EmployeeeDAO;
import com.deloitte.emp.dao.impl.EmployeeeDAOImpl;
import com.deloitte.emp.model.Employeee;

public class EmployeeeData {
	public static void main(String[] args) {
		System.out.println("Enter Employee Data : ");
		Scanner scanner = new Scanner(System.in);
		Employeee emp = new Employeee();
		System.out.println("Enter emp first name ");
		String Fname = scanner.next();
		System.out.println("Enter emp last name address ");
		String LastName = scanner.next();
		System.out.println("Enter emp id ");
		String Empid = scanner.next();
		System.out.println("Enter emp dob ");
		String Dob = scanner.next();
		System.out.println("Enter emp address");
		String Address = scanner.next();
		EmployeeeDAO employeeDAO = new EmployeeeDAOImpl();
		((EmployeeeDAOImpl) employeeDAO).insertEmployee(emp);
		System.out.println(Fname+"\nyour details has been inserted");
	}
}