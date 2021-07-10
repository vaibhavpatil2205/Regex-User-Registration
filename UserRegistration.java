package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

	public class UserRegistration {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Chose Option-\n"+"1.Enter First Name\n"+
			                                     "2.Enter Last Name\n"+
					                             "3.Enter Email Address\n"+
			                                     "4.Enter Phone No\n"+
					                             "5.Enter Password\n");
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
		      
	       case 4:
	    	   
	    	   Scanner scanner4 = new Scanner(System.in);
		       System.out.println("Enter Phone No");

		
		       String phoneno = scanner4.next();
		 
		       String regex4 = "^[0-9]{2}\\s{0,1}[0-9]{10}$";
		 
		       Pattern pattern4 = Pattern.compile(regex4);
			   Matcher matcher4 = pattern4.matcher(phoneno);
			
			   boolean result4 = matcher4.matches();
			   if (result4)
				   
			   System.out.println("Valid Phone No ");
			   
			 else
				 
			   System.out.println("Invali Phone No");
			   
			   
	       case 5:
	    	   
	    	   Scanner scanner5 = new Scanner(System.in);
		       System.out.println("Enter Password");

		
		       String password = scanner5.next();
		 
		       String regex5 = "^[0-9]{8,}$";
		 
		       Pattern pattern5 = Pattern.compile(regex5);
			   Matcher matcher5 = pattern5.matcher(password);
			
			   boolean result5 = matcher5.matches();
			   if (result5)
				   
			   System.out.println("Valid Password ");
			   
			 else
				 
			   System.out.println("Invalid Password");
			   
			   
	      case 6:
	      
	      Scanner scanner6 = new Scanner(System.in);
	       System.out.println("Enter Password");

	
	       String password2 = scanner6.next();
	 
	       String regex6 = "^[A-Z]{1}+[a-zA-Z0-9]{8,}$";
	 
	       Pattern pattern6 = Pattern.compile(regex6);
		   Matcher matcher6 = pattern6.matcher(password2);
		
		   boolean result6 = matcher6.matches();
		   if (result6)
			   
		   System.out.println("Valid Password ");
		   
		 else
			 
		   System.out.println("Invalid Password");
		   
	          	       	   
		   }

		}
	}
