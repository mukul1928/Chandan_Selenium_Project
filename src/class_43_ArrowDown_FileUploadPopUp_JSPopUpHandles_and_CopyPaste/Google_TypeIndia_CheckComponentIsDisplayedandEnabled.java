package class_43_ArrowDown_FileUploadPopUp_JSPopUpHandles_and_CopyPaste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_TypeIndia_CheckComponentIsDisplayedandEnabled {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.name("q"));
		if (search.isDisplayed() == true && search.isEnabled() == true) {
			search.sendKeys("India");
		}
		Thread.sleep(2000);
		WebElement searchbutton = driver.findElement(By.name("btnK"));
		searchbutton.click();

	}

}
