package class_42_SyntaxOfXpath_Handled_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_ClickOnMobile_Using_Xpath_Without_A {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		WebElement click_mobile = driver.findElement(By.xpath("(//span[.='Mobiles'])[1]"));
		click_mobile.click();
	}

}
