package com.cg.framework;

public abstract class ShopFactory 
{
	public abstract  PrimeAcc getNewPrime(int AccNo,String accnm, float charges, boolean isPrime);
	public abstract  NormalAcc getNormal(int AccNo,String accnm, float charges, boolean isPrime);
	public PrimeAcc getNewPrimeAcc(int AccNo, String accnm, float charges, boolean isPrime) {
	
		return null;
	}

}
