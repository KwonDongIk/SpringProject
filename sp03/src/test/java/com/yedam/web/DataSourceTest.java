package com.yedam.web;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring/datasource-context.xml")

public class DataSourceTest {

	@Setter(onMethod_= {@Autowired})
	DataSource dataSource;
	
	@Test
	public void 데이터소스연결() {
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
