package com.loanapplication;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestValidations {

	@Test
	public void testValidateAccountNumber_Positive() {
		
		ValidateCustomerData vcd = new ValidateCustomerData();
		//
		String accountNumber = "4512";
		Boolean actualValue = vcd.validateAccountNumber(accountNumber);
		Boolean expectedValue = true;
		
		assertEquals(expectedValue, actualValue);

		
	}
	
	@Test
	public void testValidateAccountNumber_Negative() {
		
		ValidateCustomerData vcd = new ValidateCustomerData();
		//
		String accountNumber = "4155";
		Boolean actualValue = vcd.validateAccountNumber(accountNumber);
		Boolean expectedValue = false;
		
		assertEquals(expectedValue, actualValue);

		
	}

	
	  @Test public void testValidateCustomerId_Positive() {
			ValidateCustomerData vcd = new ValidateCustomerData();
			String customerId = "123456";
			Boolean actualValue = vcd.validateCustomerId(customerId);
			Boolean expectedValue = true;
			
			assertEquals(expectedValue, actualValue);		
	  
	  
	  }
	 

}
