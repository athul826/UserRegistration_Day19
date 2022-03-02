package com.bridgelabz.userregistration;

import java.util.Scanner;

public class UserRegistration {
	
	public boolean validateName(String Name) {
			
		boolean returnFlag = true;
			if(Character.isUpperCase(Name.charAt(0))) {
			
			if(Name.length() < 3) {
				
				System.out.println( "First name should have minimum Three letters");
				returnFlag = false;
			}
			}
			else {
				System.out.println( "first letter Should be capittal Letters");
				returnFlag = false;
			}
		return returnFlag;
	}
    public static void main( String[] args ) {
        
    	UserRegistration user = new UserRegistration();
    	Scanner sc = new Scanner(System.in);
    	System.out.print( "Enter your first name : ");
    	String firstName = sc.nextLine(); 
    	if(user.validateName(firstName)) {
    		System.out.print( "Enter your last name : ");
    		String lastName = sc.nextLine(); 
    		user.validateName(lastName);
    	}
    	sc.close();
	

	

	}
}
