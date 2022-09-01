package com.cg.application;


import com.cg.framework.NormalAcc;
import com.cg.framework.PrimeAcc;
import com.cg.framework.ShopFactory;

public class GSShopFactory extends ShopFactory{

	@Override
	public PrimeAcc getNewPrimeAcc(int AccNo, String accnm, float charges, boolean isPrime) {
		GSPrimeAcc p=new GSPrimeAcc (AccNo,accnm,charges,isPrime);
		return p;
	}



	@Override
	public PrimeAcc getNewPrime(int AccNo, String accnm, float charges, boolean isPrime) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public NormalAcc getNormal(int AccNo, String accnm, float charges, boolean isPrime) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
