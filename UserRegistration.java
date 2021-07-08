package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

	public class UserRegistration {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Chose Option-\n"+"1.Enter First Name\n"+"2.Enter Last Name\n"+"3.Enter Email Address\n");
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
			 
			 String regex2 = "^[A-Z]{1}[a-z]{2}$";
			 
			 Pattern pattern2 = Pattern.compile(regex2);
			 Matcher matcher2 = pattern2.matcher(lastname);
				
			 boolean result2 = matcher2.matches();
			 if (result2)
					System.out.println("Valid lastname ");
				else
					System.out.println("Invali lastname");
				
	       case 3:
		      Scanner scanner3 = new Scanner(System.in);
	          System.out.println("Enter Email Address");

	
	          String email = scanner3.next();
	 
	          String regex3 = "^[a-zA-Z]+([.][A-Za-z]+)*@[a-zA-Z]+[.]+[a-zA-Z]{2,3}+([.][A-Za-z]+)*$";
	 
	          Pattern pattern3 = Pattern.compile(regex3);
		      Matcher matcher3 = pattern3.matcher(email);
		
		      boolean result3 = matcher3.matches();
		      if (result3)
			       System.out.println("Valid Email Address ");
		      else
		 	       System.out.println("Invali Email Address");
		
          
			 
			 
			
			}

		}
	}
