package com.wipro.hospital_management;

public class Base {
	protected String name;
    protected String att_name;
    protected String phone;

    public Base(String name, String att_name, String phone) {
        this.name = name;
        this.att_name = att_name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return att_name;
    }

    public String getPhoneNumber() {
        return phone;
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + att_name);
        System.out.println("Phone Number: " + phone);
    }
}
