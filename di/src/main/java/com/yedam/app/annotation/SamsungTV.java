package com.yedam.app.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scan.BoardService;
import com.yedam.app.di.Speaker;

import lombok.RequiredArgsConstructor;
//2. 생성자 주입
//@RequiredArgsConstructor
@Component("tv")
public class SamsungTV implements TV{
	
	//1. 필드 주입 방법
	//@Autowired
	//3. Setter 방식
	//@Setter(onMethod_ = {@Autowired})
	private Speaker speaker;
	
	public void powerOn() {
		System.out.println("SamsungTV powerOn");
	}

	public void powerOff() {
		System.out.println("SamsungTV powerOff");
	}

	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}
}
