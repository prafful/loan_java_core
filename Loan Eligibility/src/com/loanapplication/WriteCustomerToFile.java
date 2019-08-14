package com.loanapplication;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteCustomerToFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//use instance of ValidateCustomerData to validate customerid and loan account number
		ValidateCustomerData vcd = new ValidateCustomerData();
		// System.out.println();
		// capture data from default input device
		Scanner input = new Scanner(System.in);
		
		//input name of the file to be created by file writer
		System.out.println("Create text file with name: ");
		String filename = input.next();
		
		File loanfile = new File(filename);
		
		if(loanfile.createNewFile()) {
			System.out.println("New file with name: " + filename + " is created!");
		}else {
			System.out.println("New file with name: " + filename + " is already present!");
		}
		
		//create list to save all customers
		List<Customer> customers = new ArrayList<Customer>();
		
		

		while (true) {
			System.out.println("**** Enter Customer Data ****");
			
			System.out.println("Customer ID: ");
			String customerId = input.next();
			//validate customer id
			Boolean checkValidCustomerId = vcd.validateCustomerId(customerId);
			if(!checkValidCustomerId){
				System.out.println("Enter customer id with 6 digits!");
				continue;
			}
			
			System.out.println("Customer Name: ");
			String customerName = input.next();
			
			System.out.println("Loan Account Number: ");
			String loanAccountNumber = input.next();
			//validate loan acccount number
			Boolean checkValidAccountNumber = vcd.validateAccountNumber(loanAccountNumber);
			if(!checkValidAccountNumber){
				System.out.println("Loan account number should start with 4 and contain only digits!");
				continue;
			}
			
			System.out.println("Loan Amount: ");
			String loanAmount = input.next();
			
			System.out.println("Total Instalments: ");
			String totalInstalments = input.next();
			
			System.out.println("Instalments Paid: ");
			String instalmentsPaid = input.next();
			
			//create new customer instance using data captured above!
			Customer c = new Customer();
			c.setCustomerId(customerId);
			c.setCustomerName(customerName);
			c.setLoanAccountNumber(loanAccountNumber);
			c.setLoanAmount(loanAmount);
			c.setTotalInstalments(totalInstalments);
			c.setPaidInstalements(instalmentsPaid);
			
			//add customer c to collection - customers
			customers.add(c);
			
			System.out.println("Input x to exit or any other key to continue: ");
			//decide if you wish to exit the loop of input or continue entering names!
			String exitCharacter = input.next();
			char exitCheck = exitCharacter.charAt(0);
			if (exitCheck == 'x' || exitCheck == 'X') {
				break;
			}

		}
		
		System.out.println("Thanks for playing! You are ouside the infinite input loop!");
		//create a file writer to save names to file
		FileWriter writer = new FileWriter(loanfile);
		//create heading before writing customers collection to file
		writer.write("Customer ID");
		writer.write(",");
		writer.write("Customer Name");
		writer.write(",");
		writer.write("Loan Ac No");
		writer.write(",");
		writer.write("Loan Amount");
		writer.write(",");
		writer.write("Total Instalments");
		writer.write(",");
		writer.write("Paid Instalments");
		writer.write("\n");
		//loop through customers collection and write to file.
		for (Customer customer : customers) {
			writer.write(customer.getCustomerId());
			writer.write(",");
			writer.write(customer.getCustomerName());
			writer.write(",");
			writer.write(customer.getLoanAccountNumber());
			writer.write(",");
			writer.write(customer.getLoanAmount());
			writer.write(",");
			writer.write(customer.getTotalInstalments());
			writer.write(",");
			writer.write(customer.getPaidInstalements());
			writer.write("\n");
		}
		
		
		System.out.println("Written Customer Data to File - " + filename);
		writer.close();
		input.close();		

	}

}
