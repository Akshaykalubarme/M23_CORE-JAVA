package com.cg.client;

import com.cg.Framework.BankFactory;
import com.cg.Framework.CurrentAcc;
import com.cg.Framework.SavingAcc;
import com.cg.application.MMBankFactory;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;

public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	BankFactory f=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(1010,"Akshay kalubarme",10000,true);
        CurrentAcc c=new MMCurrentAcc(1212,"Akshay kalubarme",15000,500);
        
        System.out.println("Saving Acount:");
         s.withraw(3000);
        System.out.println("Current Account:");
         c.withdraw(5000);
        
	}

}
