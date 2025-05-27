	package com.yedam.web.mapper;
	
	import java.util.List;
	import java.util.Map;
	
	import com.yedam.web.model.Employees;
	import com.yedam.web.model.SearchVO;
	
	public interface EmpMapper {
		
		List<Employees> findAll(SearchVO search);
		List<Map<String,Object>> findAlltoMap();
		List<Employees> getCount();
		int insert(Employees employee);
		int updateLastName(Employees employee);
		int deleteLastName(int employeeId);
		List<Employees> findEmployeeDepartment();
	}
