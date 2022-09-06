package com.cg.application;

import com.cg.Framework.BankFactory;
import com.cg.Framework.CurrentAcc;
import com.cg.Framework.SavingAcc;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAcc getNewSavingAcc(int accno, String accname, float accbal, boolean isSalaried) {
		MMSavingAcc s=new MMSavingAcc( accno,accname, accbal, isSalaried);
		return s;
	}

	@Override
	public CurrentAcc getCurrentAcc(int accno, String accname, float accbal, float creditLimit) {
		MMCurrentAcc c=new MMCurrentAcc( accno,accname, accbal, creditLimit);
		return c;
	}

}	


