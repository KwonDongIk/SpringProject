package com.yedam.app.service.Impl;

import org.springframework.stereotype.Service;

import com.yedam.app.mapper.TimeMapper;
import com.yedam.app.service.SampleService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SampleServiceImpl implements SampleService {

	private final TimeMapper timeMapper;
	
	
	@Override
	public String getTime() {
		// TODO Auto-generated method stub
		return timeMapper.getTime();
	}

	@Override
	public String getTime2() {
		// TODO Auto-generated method stub
		return timeMapper.getTime2();
	}

}
