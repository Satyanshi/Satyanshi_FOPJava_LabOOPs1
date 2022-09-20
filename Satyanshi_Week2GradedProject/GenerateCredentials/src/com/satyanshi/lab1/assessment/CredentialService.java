package com.satyanshi.lab1.assessment;

import java.util.Random;

public class CredentialService {
	
	
	public char[] generatePassword(int length)
	{
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String specialCharacters = "!@#$";
	     String lowerLetters = "abcdefghijklmnopqrstuvwxyz";
	      String numbers = "1234567890";
	      String combinedChars = capitalLetters + lowerLetters + specialCharacters + numbers;
	      Random random = new Random();
	      char[] password = new char[length];

	      password[0] = lowerLetters.charAt(random.nextInt(lowerLetters.length()));
	      password[1] = capitalLetters.charAt(random.nextInt(capitalLetters.length()));
	      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[3] = numbers.charAt(random.nextInt(numbers.length()));
	   
	      for(int i = 4; i< length ; i++) {
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
	      return password;
		
	}
	
	public String generateEmailAddress(String fname, String lname, int department, String companyName) {
		String dep = "";
		
		switch(department) {
		case 1:
			dep = "tech";
			break;
		case 2:
			dep = "admin";
			break;
		case 3:
			dep = "hr";
			break;
		case 4:
			dep ="legal";
			break;
		default:
			System.out.println("Invalid department selection, please try again");
		}
		
		String email = fname+lname+"@"+dep+"."+companyName+"."+"com";
		return email;
		
	}
	
	protected void showCredentials(String fname, String email, char[] password) {
		System.out.println("Dear "+fname+" your generated credentials are as follows");
		System.out.println("Email    ---> "+ email);
		System.out.println("Password ---> "+ password);
	}

}
