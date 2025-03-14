package com.daily.concepts.immutable;

public class Company{
	
	private String name;
	private String headquarter;
	
	public Company(String name, String headquarter) {
		super();
		this.name = name;
		this.headquarter = headquarter;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeadquarter() {
		return headquarter;
	}
	public void setHeadquarter(String headquarter) {
		this.headquarter = headquarter;
	}
	
	@Override
	public String toString() {
		return "Company [name=" + name + ", headquarter=" + headquarter + "]";
	}
	
	

}
