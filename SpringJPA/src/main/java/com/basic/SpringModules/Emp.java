package com.basic.SpringModules;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getMobile() {
		return mobile;
	}
	@Override
	public String toString() {
		return "Emp [empName=" + empName + ", mobile=" + mobile + "]";
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	private String empName;
	@Id
	private long mobile;
	

}
