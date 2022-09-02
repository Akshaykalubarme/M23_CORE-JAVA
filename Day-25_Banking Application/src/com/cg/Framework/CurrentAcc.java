package com.cg.Framework;

public abstract class CurrentAcc extends BankAcc
{
	private  float creditLimit;
	//Generate constructor using fields
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	public void withdraw(float accBal)
	{
		System.out.println("Account No: "+this.getAccNo()+" "+"Account Name: "+this.getAccNm()
		+"Charges is: "+this.getAccBal());
	}
	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}
	
}
