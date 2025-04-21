package class_43_ArrowDown_FileUploadPopUp_JSPopUpHandles_and_CopyPaste;

import org.openqa.selenium.chrome.ChromeDriver;

public class GroTechMindsHTML_JS_PopUpHandle {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///E:/AT_39_Batch/learningHTML1.html");
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
	}
	

}
