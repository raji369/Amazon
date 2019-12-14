package org.samsungm30.pages;

import org.amazon.base.ProjectSpecificMethod;

public class SamsungM30Page extends ProjectSpecificMethod {
	
	public SamsungM30Page printDeliveryByDate() {
		String deliveryMesage = driver.findElementById("ddmDeliveryMessage").getText();
		String deliveryBy = deliveryMesage.substring(13,25);
		System.out.println("Delivery by = " + deliveryBy);
		return this;
	}
	
	public AmazoninShoppingCartPage clickAddToCart() {
		driver.findElementById("add-to-cart-button").click();
		return new AmazoninShoppingCartPage();
	}
	

}
