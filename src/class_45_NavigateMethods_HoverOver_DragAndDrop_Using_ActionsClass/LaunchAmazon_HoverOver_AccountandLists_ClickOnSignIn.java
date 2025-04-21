package class_45_NavigateMethods_HoverOver_DragAndDrop_Using_ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LaunchAmazon_HoverOver_AccountandLists_ClickOnSignIn {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement hoverover = driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(hoverover).perform();
		Thread.sleep(2000);
		WebElement signin = driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
		signin.click();
		

	}
}
