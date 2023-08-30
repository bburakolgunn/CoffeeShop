package Entities;

import java.time.LocalDate;

import Abstract.IEntity;

public class Customer implements IEntity {
	
	public String NationalityId;
	public String FirstName;
	public String LastName;
	public int Year;
	public Customer(String nationalityId, String firstName, String lastName, int year) {
		super();
		NationalityId = nationalityId;
		FirstName = firstName;
		LastName = lastName;
		Year = year;
	}
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	
	}
	

