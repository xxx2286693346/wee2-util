package com.ycl.week2.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class Tps {
	
	private BigInteger id;
	private String name;
	private Integer age;
	private BigDecimal price;
	private Date time;
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Tps(BigInteger id, String name, Integer age, BigDecimal price, Date time) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.price = price;
		this.time = time;
	}
	public Tps() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Tps [id=" + id + ", name=" + name + ", age=" + age + ", price=" + price + ", time=" + time + "]";
	}
	
	
}
