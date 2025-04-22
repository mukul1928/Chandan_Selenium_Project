package class_45_NavigateMethods_HoverOver_DragAndDrop_Using_ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GroTechMinds_DragAndDrop_DoubleClick {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://grotechminds.com/drag-and-drop/");
		WebElement source = driver.findElement(By.id("drag5"));
		WebElement destination = driver.findElement(By.id("div2"));
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(source, destination).perform();
		a1.doubleClick(destination).perform();
	}

}
