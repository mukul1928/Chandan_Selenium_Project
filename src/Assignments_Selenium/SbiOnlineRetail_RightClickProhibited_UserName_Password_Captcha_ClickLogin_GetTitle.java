package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SbiOnlineRetail_RightClickProhibited_UserName_Password_Captcha_ClickLogin_GetTitle {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.onlinesbi.sbi/");
		WebElement login = driver.findElement(By.xpath("(//span[.='LOGIN'])"));
		login.click();
		WebElement conti = driver.findElement(By.xpath("//a[.='CONTINUE TO LOGIN']"));
		conti.click();
		WebElement un = driver.findElement(By.xpath("(//input[@id='username'])"));
		un.sendKeys("chandan007@");
		WebElement pass = driver.findElement(By.xpath("(//input[@id='label2'])"));
		pass.sendKeys("mukul@007143#^");
		WebElement captcha = driver.findElement(By.xpath("(//input[@id='loginCaptchaValue'])"));
		captcha.sendKeys("gc48k");
		WebElement clicklogin = driver.findElement(By.xpath("(//input[@id='Button2'])"));
		clicklogin.click();
		driver.getTitle();

	}

}
