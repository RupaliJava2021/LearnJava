package com.JavaProg.assignment01;

public class EmployeeSalary {
	int basicSalary;
	double total,hra,ta;
	double calcEmpHraTa(int basicSalary)
	{
		this.basicSalary=basicSalary;
	    	this.hra=this.basicSalary*0.1;
	    	System.out.println("Employee HRA ==>"+this.hra);
	    	this.ta=this.basicSalary*0.05;
	    	System.out.println("Employee TA ==>"+this.ta);
	    	this.total=this.basicSalary+this.hra+this.ta;
	    	return this.total;
	}
	

}
