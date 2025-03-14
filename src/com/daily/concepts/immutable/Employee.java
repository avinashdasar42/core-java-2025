package com.daily.concepts.immutable;

import java.util.Objects;

public final class Employee implements Cloneable{

	private final String fname;
	private final String lname;
	//New variable 
	private Company company;
	
	public Employee(String fname, String lname, Company company) {
		this.fname = fname;
		this.lname = lname;
		this.company = company;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public Company getCompany() {
		return company;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return fname.equals(employee.fname) && lname.equals(employee.lname) && company.equals(employee.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fname, lname, company);
    }
	
	@Override
    protected Object clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        cloned.company = new Company(company.getName(),company.getHeadquarter());
        return cloned;
    }

	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", lname=" + lname + ", company=" + company + "]";
	}
	
}
