package com.skilltrace.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="employees1")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long employeeId;
	
	@NotEmpty(message="Name can not be empty")
	private String employeeName;
	
	@NotEmpty(message="Department can not be empty")
	private String dept;
	
	@NotEmpty(message="Email can not be empty")
	private String email;
	
	@NotEmpty(message="mbno can not be empty")
	private String mbno;
	
	@NotEmpty(message="Company can not be empty")
	private String company;
	
	
	public Employee() {
		
	}


	public Employee(long employeeId, String employeeName,String dept,String email, String mbno,String company) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.dept = dept;
		this.email = email;
		this.mbno = mbno;
		this.company = company;
	}


	public long getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMbno() {
		return mbno;
	}


	public void setMbno(String mbno) {
		this.mbno = mbno;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}
	
	
	
	

}