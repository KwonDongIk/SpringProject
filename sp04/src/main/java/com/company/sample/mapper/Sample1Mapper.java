package com.company.sample.mapper;

import org.apache.ibatis.annotations.Insert;

public interface Sample1Mapper {
	
	@Insert("INSERT INTO tbl_sample1 (col) VALUES (#{data})")
	public int isertCol1(String data);

}
