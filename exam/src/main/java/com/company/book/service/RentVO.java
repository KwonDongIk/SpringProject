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
public class RentVO {
	
	private int rent_no;
	private int book_no;
	private int rent_price;
	private Date rent_date;
	private int rent_status;

}
