package com.JavaProg.assignment01;

public class EmployeeTax extends EmployeeSalary {
	double calcProfessionalTaxDeduct(double salary)
	{
		double total=salary*0.02;
		System.out.println("Professional Tax deduct ==>"+total);
		double grossSalary=salary-total;
		return grossSalary;
	}

	public static void main(String[] args) {
		EmployeeTax empSalary=new EmployeeTax();
		double totalSalary=empSalary.calcEmpHraTa(4000);
		System.out.println("Employee total Salary  ==>"+totalSalary);
		double grossSalary=empSalary.calcProfessionalTaxDeduct(totalSalary);
		System.out.println("Gross Salary ==>"+grossSalary);
	
	}

}
