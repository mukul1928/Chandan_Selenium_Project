package class_42_SyntaxOfXpath_Handled_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Login_X_ClosePopup_Using_Xpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com");
		Thread.sleep(3000);
		WebElement x_close = driver.findElement(By.xpath("(//span[.='✕'])"));
		x_close.click();
	}

}
