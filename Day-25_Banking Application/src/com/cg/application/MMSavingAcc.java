package com.cg.application;

import com.cg.Framework.SavingAcc;

public class MMSavingAcc extends SavingAcc
{

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaray) {
		super(accNo, accNm, accBal, isSalaray);
		
	}

	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + "]";
	}
	public void withdraw(float accBal)
	{
		System.out.println("Account No: "+this.getAccNo()+" "+"Account Name: "+this.getAccNm()
		+"Charges is: "+this.getAccBal());
	}
		

}
