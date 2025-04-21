package class_45_NavigateMethods_HoverOver_DragAndDrop_Using_ActionsClass;

import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Navigate {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		Thread.sleep(2000);
		driver.navigate().back();//it will go again to empty browser
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

}
