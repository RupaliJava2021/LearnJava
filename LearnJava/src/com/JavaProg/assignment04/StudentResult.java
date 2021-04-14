package com.JavaProg.assignment04;

public class StudentResult {
	int arr[]= {56,89,78,90,96};
	double calcPercentage()
	{
		int total=0;
		for(int i=0;i<arr.length;i++)
		{
		total=total+arr[i];
		}
		double percent=total/arr.length;
		System.out.println("Aggregate is = "+percent);
		return percent;
	}
	void calcResult(double percent)
	{
		if(percent>=75)
           System.out.println("Distinction");
		else if((percent<75)&&(percent>=60))
			System.out.println("First Class");
		       else if((percent>40)&&(percent<60))
		    	   System.out.println("Second Class");
		       else
		    	   System.out.println("Fail");
	}
	

	public static void main(String[] args) {
		StudentResult result=new StudentResult();
		
		result.calcResult(result.calcPercentage());
		

	}

}
