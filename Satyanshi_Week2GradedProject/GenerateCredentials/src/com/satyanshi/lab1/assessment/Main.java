package com.satyanshi.lab1.assessment;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your first name");
		String firstName = sc.nextLine();
		System.out.println("Please enter your last name");
		String lastName = sc.nextLine();
		System.out.println("Please enter the department from the following\n 1. Technical \n "
				+ "2.Admin \n 3. Human Resource \n 4.Legal");
		int department = sc.nextInt();
		
		Employee name = new Employee(firstName, lastName);
		CredentialService obj = new CredentialService();
		String email = obj.generateEmailAddress(name.firstName, name.lastName, department, "DemoCompany");
		char[] password = obj.generatePassword(10);
		obj.showCredentials(name.firstName, email, password);
	
	}

}
