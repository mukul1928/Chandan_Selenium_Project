package class_43_ArrowDown_FileUploadPopUp_JSPopUpHandles_and_CopyPaste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroTechMinds_Registration_Handle_File_Upload_PopUp {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registeration-form/");
		WebElement upload = driver.findElement(By.name("profile-upload"));
		upload.sendKeys("C:\\Users\\mukul\\eclipse-workspace\\Chandan_Selenium_Project\\src\\class_43_ArrowDown_FileUploadPopUp_JSPopUpHandles_and_CopyPaste.java");
		
	}
}
