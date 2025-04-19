package class_39_Google_SearchIndia;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon_Login {
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();

		driver.get(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("ap_email")).sendKeys("chandanpandey1928@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("mukul1928@");
		driver.findElement(By.id("signInSubmit")).click();
	}

}
