package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(schema ="hr" , name = "Bookings")

public class Bookings {

	@Id
	private int userId;

	@Column
	private int flightId;
	
	@Column
	private String bookingDate;
	
	@Column 
	private int nop;
	
	@Column 
	private int totalprice;
	
	
	
	
	public Bookings() {
		// TODO Auto-generated constructor stub
	}

	
}
