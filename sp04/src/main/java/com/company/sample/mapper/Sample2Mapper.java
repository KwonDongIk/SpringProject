package com.company.sample.mapper;

import org.apache.ibatis.annotations.Insert;

public interface Sample2Mapper {
	
	@Insert("INSERT INTO tbl_sample2 (col2) VALUES (#{data})")
	public int isertCol2(String data);

}
