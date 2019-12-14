package poc;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.amazon.base.ProjectSpecificMethod;
import org.testng.annotations.Test;

public class BuyProduct extends ProjectSpecificMethod {

	@Test 
	public void errorMessage(){
		{
			driver.findElementByXPath("//input[@id = 'twotabsearchtextbox']").sendKeys("Samsung Galaxy M30");
			driver.findElementByXPath("(//input[@type = 'submit'])[1]").click();
			String price = driver.findElementByXPath("(//span[@class = 'a-price-whole'])[1]").getText();
			System.out.println("Price = " + price);
			driver.findElementByXPath("(//img[@class = 's-image'])[1]").click();
			Set<String> getAllWindow = driver.getWindowHandles();
			List<String> windowsList = new ArrayList<String>();
			windowsList.addAll(getAllWindow);
			driver.switchTo().window(windowsList.get(1));
			System.out.println("Title = " + driver.getTitle());
			String deliveryMesage = driver.findElementById("ddmDeliveryMessage").getText();
			String deliveryBy = deliveryMesage.substring(13,25);
			System.out.println("Delivery by = " + deliveryBy);
			driver.findElementById("add-to-cart-button").click();
			boolean verifyAddedToCart = driver.getPageSource().contains("Added To Cart");
			if (verifyAddedToCart==true)
			{
				System.out.println("Product is added to Cart");
			}
			else
			{
				System.out.println("Product is not added to Cart");
			}
			driver.findElementByXPath("(//a[contains (text(), 'Proceed to Buy')])[1]").click();
			driver.findElementById("continue").click();
			boolean errorMessage = driver.getPageSource().contains("Enter your email or mobile phone number");
			if (errorMessage==true)
			{
				System.out.println("Email is not entered");
			}
			else
			{
				System.out.println("Email is entered");
			}

		}
	}

}