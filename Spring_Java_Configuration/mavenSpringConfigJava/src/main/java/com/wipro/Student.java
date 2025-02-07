package com.wipro;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
 
 
//@Component
public class Student {
 
//	@Value("777")
	private Integer stid;
	
//	@Value("pratyush")
	private String stname;
	
//	@Autowired
	private Address address;
	
	
	
	public Integer getStid() {
		return stid;
	}
 
	public void setStid(Integer stid) {
		this.stid = stid;
	}
 
	public String getStname() {
		return stname;
	}
 
	public void setStname(String stname) {
		this.stname = stname;
	}
 
	
 
	
	
	public Student(Integer stid, String stname, Address address) {
		super();
		this.stid = stid;
		this.stname = stname;
		this.address = address;
	}
 
	public Address getAddress() {
		return address;
	}
 
	public void setAddress(Address address) {
		this.address = address;
	}
 
	public Student()
	{
		
	}
	
	@Override
	public String toString()
	{
		return stid + " " + stname + " " + address;
	}
	
	
	
	
}