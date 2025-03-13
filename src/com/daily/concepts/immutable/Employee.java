package com.daily.concepts.immutable;

public final class Employee {

	private final String name;
	private final String company;
	
	public Employee(String name, String company) {
		super();
		this.name = name;
		this.company = company;
	}
	public String getName() {
		return name;
	}
	public String getCompany() {
		return company;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public void setCompany(String company) {
//		this.company = company;
//	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", company=" + company + "]";
	}
	
}
