package com.JavaProg.assignment02;

public class ClassMomentum {

	void calcMomentum(int mass,double velocity)
	{
		double momentum;
		momentum=mass*velocity;
		System.out.println("Momentum of product is==>"+momentum);
		
	}
	public static void main(String[] args) {
		ClassMomentum momentum=new ClassMomentum();
		momentum.calcMomentum(12,1.5);

	}

}
