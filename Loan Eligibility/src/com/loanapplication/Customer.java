package com.loanapplication;

public class Customer {
	
	
	private String customerId;
	
	private String customerName;
	
	private String loanAccountNumber;
	
	private String loanAmount;
	
	private String totalInstalments;
	
	private String paidInstalements;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getLoanAccountNumber() {
		return loanAccountNumber;
	}

	public void setLoanAccountNumber(String loanAccountNumber) {
		this.loanAccountNumber = loanAccountNumber;
	}

	public String getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getTotalInstalments() {
		return totalInstalments;
	}

	public void setTotalInstalments(String totalInstalments) {
		this.totalInstalments = totalInstalments;
	}

	public String getPaidInstalements() {
		return paidInstalements;
	}

	public void setPaidInstalements(String paidInstalements) {
		this.paidInstalements = paidInstalements;
	}

	public Customer(String customerId, String customerName, String loanAccountNumber, String loanAmount,
			String totalInstalments, String paidInstalements) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.loanAccountNumber = loanAccountNumber;
		this.loanAmount = loanAmount;
		this.totalInstalments = totalInstalments;
		this.paidInstalements = paidInstalements;
	}

	public Customer() {
		super();
	}
	
	

}
