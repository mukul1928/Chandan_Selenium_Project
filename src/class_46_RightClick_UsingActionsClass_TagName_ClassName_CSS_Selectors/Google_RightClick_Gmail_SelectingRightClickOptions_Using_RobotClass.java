package class_46_RightClick_UsingActionsClass_TagName_ClassName_CSS_Selectors;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google_RightClick_Gmail_SelectingRightClickOptions_Using_RobotClass {
	public static void main(String[] args) throws AWTException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		WebElement ele = driver.findElement(By.linkText("Gmail"));
		Actions a1 = new Actions(driver);
		a1.contextClick(ele).perform();
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_ENTER);

	}

}
