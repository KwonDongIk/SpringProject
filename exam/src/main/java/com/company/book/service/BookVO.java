package com.company.book.service;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookVO {
	
	private int book_no;
	private String book_name;
	private String book_coverimg;
	private Date book_date;
	private int book_price;
	private String book_publisher;
	private String book_info;

}
