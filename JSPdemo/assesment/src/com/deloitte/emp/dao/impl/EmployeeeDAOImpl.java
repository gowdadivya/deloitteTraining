package com.deloitte.emp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.delloite.utility.DbUtility;
import com.deloitte.emp.dao.EmployeeeDAO;
import com.deloitte.emp.model.Employeee;

public class EmployeeeDAOImpl implements EmployeeeDAO{
	
	private static final String INSERT_EMPLOYEE_QUERY = "insert into hr.employeee values (?,?,?,?,?)";


	public boolean insertEmployee(Employeee employee) {
		Connection connection = DbUtility.getMyConnection();
		int noOfRecords = 0;
		try {
			PreparedStatement statement = connection.prepareStatement(INSERT_EMPLOYEE_QUERY);
			statement.setString(1, employee.getFname());
			statement.setString(2, employee.getLastName());
			statement.setDate(4, employee.getDob());
			statement.setString(5, employee.getAddress());
			statement.setString(3,employee.getEmpid());
		
			noOfRecords = statement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (noOfRecords == 0)
			return false;
		else
			return true;

	}

}
