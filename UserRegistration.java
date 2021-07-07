package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

	public class UserRegistration {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Chose Option-\n"+"1.Enter First Name\n"+"2.Enter Last Name\n");
			int option = scanner.nextInt();
			switch (option) {
			
			case 1:
			
			Scanner scanner1 = new Scanner(System.in);
			System.out.println("Enter First Name");
			
			//First name must start with Capital letter and has minimum length is 3
			
			 String firstname = scanner1.next();
		     String regex = "^[A-Z]{1}[a-z]{2}$";
			  	
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(firstname);
				
				boolean result = matcher.matches();
				if (result)
					System.out.println("Valid firstname ");
				else
					System.out.println("Invali firstname");
                break;
                
			case 2:
			
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("Enter Last Name");

			
			 String lastname = scanner2.next();
			 
			 string regex2 = "^[A-Z]{1}[a-z]{2}$";
			 
			 Pattern pattern2 = Pattern.compile(regex2);
				Matcher matcher2 = pattern.matcher(firstname);
				
				boolean result2 = matcher2.matches();
				if (result)
					System.out.println("Valid lastname ");
				else
					System.out.println("Invali lastname");
          
			 
			 
			
			}

		}
	}
