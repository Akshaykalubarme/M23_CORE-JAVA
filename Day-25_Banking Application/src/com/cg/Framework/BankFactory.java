package com.cg.Framework;

public abstract class BankFactory 
{
	public abstract SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal);
	
	public abstract CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal);

}
