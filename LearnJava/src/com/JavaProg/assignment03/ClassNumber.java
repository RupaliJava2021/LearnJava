package com.JavaProg.assignment03;

public class ClassNumber {
	int arr[]= {3,60,5,8,9};
	void calcMax()
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{	
		if(arr[i]>max)
		{
			max=arr[i];
		}
		}
		System.out.println("Maximum num ="+max);
	}
	
	void calcMin()
	{
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{	
		if(arr[i]<min)
		{
			min=arr[i];
		}
		}
		System.out.println("Minimum num ="+min);
	}
	int calcSum()
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			
			sum=sum+arr[i];
			
		}
		System.out.println("Calculate Sum = "+sum);
		return sum;
	}
	void calcAvg(int sum)
	{
		int avg;
		avg=sum/arr.length;
		System.out.println("Average number ="+avg);
	}
	public static void main(String[] args) {
		ClassNumber obj=new ClassNumber();
		obj.calcMax();
		obj.calcMin();
		obj.calcSum();
		obj.calcAvg(obj.calcSum());
		
	}

}
