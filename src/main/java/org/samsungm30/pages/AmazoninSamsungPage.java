package org.samsungm30.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.amazon.base.ProjectSpecificMethod;

public class AmazoninSamsungPage extends ProjectSpecificMethod {

	public AmazoninSamsungPage getPrice() {
		String price = driver.findElementByXPath("(//span[@class = 'a-price-whole'])[1]").getText();
		System.out.println("Price = " + price);
		return this;
	}

	public AmazoninSamsungPage clickImage() {
		driver.findElementByXPath("(//img[@class = 's-image'])[1]").click();
		return this;
	}
	
	public SamsungM30Page moveToNewPage() {
		Set<String> getAllWindow = driver.getWindowHandles();
		List<String> windowsList = new ArrayList<String>();
		windowsList.addAll(getAllWindow);
		driver.switchTo().window(windowsList.get(1));
		System.out.println("Title = " + driver.getTitle());
		return new SamsungM30Page();
	}


}
