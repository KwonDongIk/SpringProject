package com.example.demo.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
public class EmpMapperTest {
	
	@Autowired EmpMapper empmapper;
	
	@Test
	public void list() {
		empmapper.getEmpList(null);
	}

}
