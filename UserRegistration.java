package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

	public class UserRegistration {
		public static void main(String[] args) {
			System.out.println("Enter First Name");
			Scanner scanner = new Scanner(System.in);
			
			//First name must start with Capital letter and has minimum length is 3
			
			 String firstname = scanner.next();
		     String regex = "^[A-Z]{1}[a-z]{2}$";
			  	
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(firstname);
				
				boolean result = matcher.matches();
				if (result)
					System.out.println("Valid firstname ");
				else
					System.out.println("Invali firstname");

			}

		}
