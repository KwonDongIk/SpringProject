package com.yedam.web;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.web.mapper.EmpMapper;
import com.yedam.web.model.Employees;
import com.yedam.web.model.SearchVO;

import jdk.internal.org.jline.utils.Log;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring/datasource-context.xml", "classpath:/spring/mybatis-context.xml"})
public class EmpMapperTest {
	
	@Autowired EmpMapper empMapper;
	
	//@Test
	public void 전체조회() {
		SearchVO searchVO = new SearchVO();
				 searchVO.setDepartmentId("30");
				 searchVO.setSalary("3000");
				 searchVO.setIds(Arrays.asList(100, 101, 102));
				
		empMapper.findAll(searchVO).forEach(emp->
				System.out.println(emp.getEmployeeId() +":" + emp.getFirstName()));
	}
	
	@Test
	public void findEmployeeDepartment() {
		List<Employees> list = empMapper.findEmployeeDepartment();
		//Log.info(list.toString());
		list.forEach(emp -> Log.info(emp.getFirstName() + ":" + emp.getDepartment().getDepartmentName()));
	}
	
	//@Test
	public void findAlltoMap() {
		empMapper.findAlltoMap().forEach(emp -> 
				System.out.println(emp.get("first_name")));
	}
	
	//@Test
	public void getCount() {
		List<Employees> result = empMapper.getCount();
		result.forEach(emp ->
				System.out.println(emp.getCnt()));
	}
	
	//@Test
	public void insert() {
		Employees employee = Employees.builder()
				.employeeId("301")
				.lastName("Christiano")
				.email("cr7@manu.com")
				.hireDate("2021/09/01")
				.jobId("IT_PROG")
				.build();
		int result = empMapper.insert(employee);
		System.out.println(result);
	}
	
	//@Test
	public void update() {
		Employees employee = new Employees();
		employee.setEmployeeId("301");
		employee.setLastName("Choi");
		int result = empMapper.updateLastName(employee);
		System.out.println(result);
		
	}
	
	//@Test
	public void delete() {
		int result = empMapper.deleteLastName(301);
		System.out.println(result);
	}

}
