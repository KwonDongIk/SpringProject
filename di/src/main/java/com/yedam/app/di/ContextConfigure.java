package com.yedam.app.di;

import org.springframework.context.annotation.Bean;

public class ContextConfigure {
	
	@Bean
	public Speaker speaker() {
		return new AppleSpeaker();
	}
	@Bean
	public TV tv() {
		LgTV tv = new LgTV(speaker()); // 생성자 방식 LgTV tv = new LgTV(speaker());
		//tv.setSpeaker(speaker());
		return tv;
	}

}
