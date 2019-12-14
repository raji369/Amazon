package org.samsungm30.pages;

import org.amazon.base.ProjectSpecificMethod;

public class AmazoninShoppingCartPage extends ProjectSpecificMethod {
	
	public AmazoninShoppingCartPage confirmAddedToCartMsg() {
		boolean verifyAddedToCart = driver.getPageSource().contains("Added To Cart");
		if (verifyAddedToCart==true)
		{
			System.out.println("Product is added to Cart");
		}
		else
		{
			System.out.println("Product is not added to Cart");
		}
		
		return this;
		
	}
	
	public AmazonSignInPage clickProceedToBuy() {
		driver.findElementByXPath("(//a[contains (text(), 'Proceed to Buy')])[1]").click();
		return new AmazonSignInPage();
	}

}
