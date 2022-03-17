package com.example.SampleDemo;

public class Emp {
	
	private int eid;
	private String name;
	private Double esalary;
	
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", name=" + name + ", esalary=" + esalary + "]";
	}

	public Emp() {}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getEsalary() {
		return esalary;
	}
	public void setEsalary(Double esalary) {
		this.esalary = esalary;
	}

}
