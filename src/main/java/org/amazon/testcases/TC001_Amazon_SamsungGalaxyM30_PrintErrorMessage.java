package org.amazon.testcases;

import org.amazon.base.ProjectSpecificMethod;
import org.samsungm30.pages.OnlineShoppingPage;
import org.testng.annotations.Test;

public class TC001_Amazon_SamsungGalaxyM30_PrintErrorMessage extends ProjectSpecificMethod {
	
	@Test
	public void runTC001() {
		new OnlineShoppingPage()
		.typeText()
		.clickEnter()
		.getPrice()
		.clickImage()
		.moveToNewPage()
		.printDeliveryByDate()
		.clickAddToCart()
		.confirmAddedToCartMsg()
		.clickProceedToBuy()
		.clickContinue()
		.verifyErrorMsg();
		
	}

}
