package com.JavaProg.assignment09;

import java.io.IOException;
import java.util.Scanner;

public class ClassString {
	//String str=null;
	
	void calculateStr(String str)
	{
		
	   int len=str.length();
	   System.out.println("length of string ="+len);
	}
	
	
	void reverseString(String str)
	{
		//this.str=str;
		if(str!=null)
		{
			for(int i=str.length()-1;i>=0;i--)
		{
		    System.out.print(str.charAt(i));
		   
		}	
		}else
			System.out.println("null");
		
	}
	void chkequality()
	
	{
		System.out.println("");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first object=");
		String s1=sc.next();
		System.out.println("Enetr second object =");
         String s2=sc.next();
         if(s1.equals(s2))
             System.out.println("Strings are equal");
         else
        	 System.out.println("Strings are not equal");
         sc.close();
		}
	
	
	boolean chkSubString(String str)
	{
		//Scanner sc=new Scanner(System.in);
		System.out.println("Enter sub string =java");
		String str1="java";
       // String str1=sc.next();
		boolean isPresent;
       isPresent = str.indexOf(str1) != -1  ? true : false;
       //sc.close();
		return isPresent;
		
	}
	
	
	
	public static void main(String[] args) {
		
		ClassString obj=new ClassString();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string =");
		String str =sc.next();
		obj.calculateStr(str);
		obj.reverseString(str);
		
		obj.chkequality();
		
		
		boolean isPresent=obj.chkSubString(str);
		System.out.println("substring is  available ="+isPresent);
		sc.close();
		
	}

}
