package com.cg.application;

import com.cg.Framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accno, String accname, float accbal, float creditLimit) {
		super(accno, accname, accbal, creditLimit);
		
		}

	@Override
	public String toString() {
		return String.format("MMCurrentAcc []");
	}

}
