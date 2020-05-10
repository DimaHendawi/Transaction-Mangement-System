package com.luv2code.springdemo.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class TransactionFilters {
	private Integer type = null;
	private Integer categoryId = null;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonSerialize(using = LocalDateSerializer.class)
	LocalDate from ;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonSerialize(using = LocalDateSerializer.class)
	private LocalDate to ;
	
	public TransactionFilters( Integer type,  Integer categoryId,
			 LocalDate from,  LocalDate to) {
		super();
		this.type = type;
		this.categoryId = categoryId;
		this.from = from;
		this.to = to;

	}

	public TransactionFilters() {
		// TODO Auto-generated constructor stub
	}

	

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getcategoryId() {
		return categoryId;
	}

	public void setcategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public LocalDate getFrom() {
		return from;
	}

	public void setFrom(LocalDate from) {
		this.from = from;
	}

	public LocalDate getTo() {
		return to;
	}

	public void setTo(LocalDate to) {
		this.to = to;
	}

}
