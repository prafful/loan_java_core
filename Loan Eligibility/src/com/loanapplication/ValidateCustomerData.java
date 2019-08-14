package com.loanapplication;

public class ValidateCustomerData {

	public boolean validateAccountNumber(String accountNumber) {

		Character temp = accountNumber.charAt(0);
		Character check = '4';
		if (temp != check) {
			return false;

		}
		return true;
	}

	public boolean validateCustomerId(String customerId) {
		if (customerId.length() > 6 || customerId.length() < 6) {
			return false;
		} else {
			for (int i = 0; i < customerId.length(); i++) {
				Character temp = customerId.charAt(i);
				if (Character.isLetter(temp)) {
					return false;
				}
			}
			return true;
		}

	}

}
