package org.japjot.springboot.employee;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="empinfo")
public class EmployeeInfo {
	
    @EmbeddedId
	private EmployeeIdentity employeeIdentity;
	

     public EmployeeIdentity getEmployeeIdentity() {
	      return employeeIdentity;
     }
     
    public void setEmployeeidentity(EmployeeIdentity employeeIdentity) {
	       this.employeeIdentity = employeeIdentity;
     }
    private String name;
    private String email;
    private String phoneNumber;
    public String getName() {
	return name;
    }
    public void setName(String name) {
	this.name = name;
    }
    public String getEmail() {
	return email;
    }
    public void setEmail(String email) {
	this.email = email;
    }
    public String getPhoneNumber() {
	return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
    }
	
	
}
