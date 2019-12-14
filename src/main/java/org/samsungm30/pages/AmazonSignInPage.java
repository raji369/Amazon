package org.samsungm30.pages;

import org.amazon.base.ProjectSpecificMethod;

public class AmazonSignInPage extends ProjectSpecificMethod {
	
	public AmazonSignInPage clickContinue() {
		driver.findElementById("continue").click();
		return this;
	}
	
	public AmazonSignInPage verifyErrorMsg() {
		boolean errorMessage = driver.getPageSource().contains("Enter your email or mobile phone number");
		if (errorMessage==true)
		{
			System.out.println("Email is not entered");
		}
		else
		{
			System.out.println("Email is entered");
		}
		return this;
	}

}
