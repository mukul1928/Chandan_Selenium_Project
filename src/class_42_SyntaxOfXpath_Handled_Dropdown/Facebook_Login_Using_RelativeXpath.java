package class_42_SyntaxOfXpath_Handled_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login_Using_RelativeXpath {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement email = driver.findElement(By.xpath("(//input[@id='email'])"));
		email.sendKeys("chandanpandey1928@gmail.com");
		WebElement password = driver.findElement(By.xpath("(//input[@id='pass'])"));
		password.sendKeys("mukul1928@");
		WebElement LogIn = driver.findElement(By.xpath("(//div[@class='_6ltg'])[1]"));
		LogIn.click();
	}

}
