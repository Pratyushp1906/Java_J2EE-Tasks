package com.wipro.myConfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
import com.wipro.Address;
import com.wipro.Student;
 
@Configuration
public class MyConfiguration {
 
	@Bean(name = "xyz")
	public Student getStudent(Address address)
	{
		Student student = new Student();
		student.setStid(200);
		student.setStname("pratyush");
		student.setAddress(getAddress());
		return student;
	}
	
	@Bean
	public Address getAddress()
	{
		Address address = new Address();
		address.setCityName("Hyd");
		address.setStateName("TG");
		return address;
	}
	
}
