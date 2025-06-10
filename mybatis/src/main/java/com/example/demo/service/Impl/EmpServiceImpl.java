package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.mapper.EmpMapper;
import com.example.demo.service.EmpService;
import com.example.demo.service.EmpVO;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class EmpServiceImpl implements EmpService{

	final EmpMapper empMapper;

	@Override
	public List<EmpVO> getEmpList(EmpVO empvo) {
		
		return empMapper.getEmpList(empvo);
	}

}
