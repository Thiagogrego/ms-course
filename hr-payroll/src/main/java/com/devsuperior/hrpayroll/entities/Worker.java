package com.devsuperior.hrpayroll.entities;

import java.io.Serializable;


@SuppressWarnings("serial")
public class Worker implements Serializable {
	
	private long id;
	private String name;
	private double dailyIncome;
	
	public Worker() {
		
	}

	public Worker(long id, String name, double dailyIncome) {
		this.id = id;
		this.name = name;
		this.dailyIncome = dailyIncome;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDailyIncome() {
		return dailyIncome;
	}

	public void setDailyIncome(double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}
	

}
