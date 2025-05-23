package com.yedam.app.di;

import org.junit.Test;

public class ConstrunctorTest {
	
	@Test
		public void 기본생성자() {
		
			Employee emp = new Employee("Min Ji", "Kim", 1500);
			//emp.setLname("kim");
			
			System.out.println(emp);
			
			
		}
}
