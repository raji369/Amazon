package org.samsungm30.pages;

import org.amazon.base.ProjectSpecificMethod;

public class OnlineShoppingPage extends ProjectSpecificMethod {

	public OnlineShoppingPage typeText() {
		driver.findElementByXPath("//input[@id = 'twotabsearchtextbox']").sendKeys("Samsung Galaxy M30");
		return this;
	}

	public AmazoninSamsungPage clickEnter() {
		driver.findElementByXPath("(//input[@type = 'submit'])[1]").click();
		return new AmazoninSamsungPage();
	}

}
