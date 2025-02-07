package com.wipro;
 
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
 
//@Component
public class Address {
	
//	@Value("Sasaram")
	
	private String cityName;
//	@Value("Patna")
	private String stateName;
	
	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
	public Address()
	{
		
	}
	public Address(String cityName, String stateName) {
		super();
		this.cityName = cityName;
		this.stateName = stateName;
	}
 
	@Override
	public String toString()
	{
		return cityName + " " + stateName;
	}
}