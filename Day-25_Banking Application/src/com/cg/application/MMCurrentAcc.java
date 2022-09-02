package com.cg.application;

import com.cg.Framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc 
{

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		
	}
	public void withdraw(float accBal)
	{
		System.out.println("Account No: "+this.getAccNo()+" "+"Account Name: "+this.getAccNm()
		+"Charges is: "+this.getAccBal());
	}
	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + "]";
	}
	
	

}
