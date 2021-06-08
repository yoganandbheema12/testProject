package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testBrowser {

	
	@Test
	public void test_Browser()
	{
		System.setProperty("webdriver.chrome.driver","./Driver_Files/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://nonprod-ph-patientadvocate.optum.com/test");
		driver.manage().window().maximize();
		driver.close();
	}
}
