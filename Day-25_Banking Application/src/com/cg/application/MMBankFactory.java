package com.cg.application;

import com.cg.Framework.BankFactory;
import com.cg.Framework.CurrentAcc;
import com.cg.Framework.SavingAcc;

public class MMBankFactory extends BankFactory
{

	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal) {
		
		return null;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal) {
		
		return null;
	}
	
}
