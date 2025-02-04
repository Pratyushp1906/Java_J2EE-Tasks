package com.wipro;

public class Student 
{
	private int Sid;
	private String name;
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", name=" + name + "]";
	}
	public Student()
	{
		
	}

}