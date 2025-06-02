package com.company.sample.service.Impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.sample.mapper.Sample1Mapper;
import com.company.sample.mapper.Sample2Mapper;
import com.company.sample.service.SampleTxService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SampleTxServiceImpl implements SampleTxService{

	private final Sample1Mapper sample1Mapper;
	private final Sample2Mapper sample2Mapper;
	
	@Transactional
	@Override
	public void addData(String value) {
		
		sample1Mapper.isertCol1(value); // 500
		sample2Mapper.isertCol2(value); // 2Mapper, 10
		
		
	}
	

}
