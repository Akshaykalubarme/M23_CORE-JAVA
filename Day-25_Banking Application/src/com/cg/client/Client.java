package com.cg.client;

import com.cg.Framework.CurrentAcc;
import com.cg.Framework.SavingAcc;
import com.cg.application.MMBankFactory;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;

public class Client {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		MMBankFactory m=new MMBankFactory();
		SavingAcc s = new MMSavingAcc(4045,"Akshay",520,true);
		CurrentAcc c = new MMCurrentAcc(1514,"Satish",750,90000);
		
		System.out.println("Saving Account: ");
		s.withdraw(5000);
		System.out.println("Current Account: ");
		c.withdraw(12000);

	}

}
