package com.cg.Framework;

public abstract class SavingAcc extends BankAcc
{
	private boolean isSalaray;
	//Generate constructor using fields
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaray) {
		super(accNo, accNm, accBal);
		this.isSalaray = isSalaray;
	}
	
	@Override
	public String toString() {
		return "SavingAcc [isSalaray=" + isSalaray + "]";
	}
	public void withdraw(float accBal)
	{
		System.out.println("Account No: "+this.getAccNo()+" "+"Account Name: "+this.getAccNm()
		+"Charges is: "+this.getAccBal());
	
	}

	
}
