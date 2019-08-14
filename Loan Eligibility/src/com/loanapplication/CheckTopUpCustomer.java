package com.loanapplication;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckTopUpCustomer {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
			// capture data from default input device
			Scanner input = new Scanner(System.in);
			
			//input name of the file to be created by file writer
			System.out.println("Read loan customer data from file: ");
			String filename = input.next();
			
			File loanfile = new File(filename);
			
			//use buffered reader to read loan file
			BufferedReader br = new BufferedReader(new FileReader(loanfile));

			//create list to save all customers
			List<Customer> customers = new ArrayList<Customer>();
			
			String line = "";
			
			while ((line = br.readLine()) != null) {
				//split each line by ,
				String[] customerData = line.split(",");
				System.out.println(customerData);
				//create new customer instance and popupate the same with customer data
				Customer c = new Customer();
				c.setCustomerId(customerData[0]);
				c.setCustomerName(customerData[1]);
				c.setLoanAccountNumber(customerData[2]);
				c.setLoanAmount(customerData[3]);
				c.setTotalInstalments(customerData[4]);
				c.setPaidInstalements(customerData[5]);
				
				//add c to customers collection
				customers.add(c);
				
			}
			
			System.out.println("");
			System.out.println("All Loan Customers: ");
			for (Customer c: customers) {
				System.out.println(c.getCustomerId() + ", " + c.getCustomerName() + ", " + c.getLoanAccountNumber() + ", "  + c.getLoanAmount() + ", " + c.getTotalInstalments() + ", "+ c.getPaidInstalements());
			}
			
			System.out.println("");
			System.out.println("Customers Eligible for TopUp: ");
			
			for(int i =1; i < customers.size() ; i++) {
				Customer c  = customers.get(i);
				int totalInstalment = Integer.parseInt(c.getTotalInstalments());
				int paidInstalment = Integer.parseInt(c.getPaidInstalements());
				if(paidInstalment > totalInstalment/2) {
					System.out.println(c.getCustomerId() + ", " + c.getCustomerName() + ", " + c.getLoanAccountNumber() + ", "  + c.getLoanAmount() + ", " + c.getTotalInstalments() + ", "+ c.getPaidInstalements());
				}
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
