package com.wipro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empid;
    private String empname;

    public Integer getEmpid() { return empid; }
    public void setEmpid(Integer empid) { this.empid = empid; }

    public String getEmpname() { return empname; }
    public void setEmpname(String empname) { this.empname = empname; }

    public Employee(Integer empid, String empname) {
        this.empid = empid;
        this.empname = empname;
    }

    public Employee() {}

    @Override
    public String toString() {
        return empid + " " + empname;
    }
}