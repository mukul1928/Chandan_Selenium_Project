package class_43_ArrowDown_FileUploadPopUp_JSPopUpHandles_and_CopyPaste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroTechMinds_AutomateMe_IsSelected {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/is-selected/");
		WebElement checkbox1 = driver.findElement(By.xpath("(//input[@id='vehicle2'])[1]"));
		/*
		 * if(checkbox1.isSelected()==false) { checkbox1.click(); }
		 */
		boolean answer = checkbox1.isSelected();
		System.out.println(answer);
		if (answer == false) {
			checkbox1.click();
		}
	}

}
