package com.yedam.domain;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeDepartmentVO {
	
	private String employeeId;
	private String firstName;
	private Date hireDate;
	private Department department;
	

}
