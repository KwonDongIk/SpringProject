package com.company.security;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordTest {
	
	@Test
	public void Test() {
		
		String rawPw = "1234";
		// Create an encoder with strength 16
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);
		String result = encoder.encode(rawPw);
		System.out.println(result);
		assertTrue(encoder.matches(rawPw, result));
		
		
	}
	

}
