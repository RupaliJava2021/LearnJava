package com.JavaProg.assignment07;

public class Numbers implements cubeNumInterface ,sqrRootInterface,sqrInterface,primeInterface,factorialNum ,primeFactorInterface{
  
   public static void main(String[] args) {
	  
	  Numbers number =new Numbers();
	  int i=75;
	
	  String s="factorial";
	  switch (s)
	  {
	  case "cube":
		  number.cubeNumber(i);
		  break;
	  case "square":
	      number.sqrNum(i);
	      break;
	  case "squareroot":    
		  number.sqrroot(i);
		  break;
	  case "primenum":
		  number.primeNum(i);
		  break;
	  case "factorial":
		  number.calcFactorial(i);
		  break;
	  case "primefactor":
		  number.primeFactorial(i);
		  break;
	  default:
		  System.out.println("Invalid Input");
		  
	     
	  }
	
	 
	 
	 
	

	}

@Override
public void cubeNumber(int num) {
	 int cube;
	  cube=num*num*num;
	  System.out.println("Cube of number ="+cube);
}

	

@Override
public void sqrroot(int num) {
	 double sqrrtnum=Math.sqrt(num);
	  System.out.println("Square root = "+sqrrtnum);
	

}

@Override
public void sqrNum(int num) {
	 int square ;
	  square=num*num;
	  System.out.println("Square of number ="+square);
	
}



@Override
public void primeNum(int num) {
	
	if(((num%2)==1)||(num==2))
		System.out.println(num+"is Prime number");
	else
		System.out.println(num + "   is not prime number");
}

@Override
public void calcFactorial(int num) {
	//int k,i;
	int fact=1;
	
	for(int i=1;i<=num;i++)
	{
			 fact=fact*i;
	}
	System.out.println("Factorial of number = "+fact);
	
}

@Override
public void primeFactorial(int num) {
	while(num%2==0)
	{
		System.out.print("2 ");
		num=num/2;
	}		
		
	 for(int i=3;i<=Math.sqrt(num);i+=2)
	 {
		 while(num%i==0)
		 {
			 System.out.print(i+" ");
		 num=num/i;
		 }
	 }	 
		 if(num>2)
			System.out.println(num);
	 } 
	}

     




