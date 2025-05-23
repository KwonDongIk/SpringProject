package com.yedam.app.di;

// 캡슐화
public class Employee {
	
	private String fname;
	private String lname;
	private int salary;
	
	
	public Employee(String fname, String lname, int salary) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
	}

	// 객체가 생성될 때 필드 초기화
	public Employee(String fname, int salary) {
		super();
		this.fname = fname;
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", lname=" + lname + ", salary=" + salary + "]";
	}


	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFname() {
		return fname;
	}
	public int getSalary() {
		return salary;
	}

}
