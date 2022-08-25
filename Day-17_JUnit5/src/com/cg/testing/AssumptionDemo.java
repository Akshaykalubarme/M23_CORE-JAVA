package com.cg.testing;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo 
{
	@Test
	void division()
	{
		System.setProperty("Akshay", "Sapna");
		// if assumption is true it will print otherwise it will not print 
		Assumptions.assumeTrue("Sapna".equals(System.getProperty("Akshay")));
		System.out.println("Assumption is True");
	}

}
