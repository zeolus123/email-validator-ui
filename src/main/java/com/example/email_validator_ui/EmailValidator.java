package com.example.email_validator_ui;

/**
 * Validates emails
 * 
 */

public class EmailValidator {

	//only variable needed
	private String email;
	
	
	//constructor
	public EmailValidator(String email){
		this.email = email;
	}
	
	//getters and setters
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	//validate method
	public boolean validate(){
		boolean valid = false;
		if((checkOneAt()) && (containsPeriod()) && (!ContainsCaret()) && (!startsWithPeriod())){
			valid = true;
		}
		return valid;
	}
	
	//helper method for validate checks if it starts with a .
	public boolean startsWithPeriod(){
		return this.email.charAt(0) == '.';
	}
	
	//helper method for validate checks if it contains the caret symbol
	public boolean ContainsCaret(){
		return this.email.contains("^");
	}
	
	//helper method for validate checks if it contains a period
	public boolean containsPeriod(){
		return this.email.contains(".");
	}
	
	//helper method that checks there is only one @ character
	public boolean checkOneAt(){
		boolean valid = false;
		for(int i = 0; i < this.email.length(); i ++){
			if(this.email.charAt(i) == '@' && valid == true){
				valid = false;
				break;
			}
			if(this.email.charAt(i) == '@'){
				valid = true;
			}
		}
		return valid;
	}
}