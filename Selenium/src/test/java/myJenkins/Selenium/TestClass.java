package myJenkins.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass {
	WebDriver driver;
	
@BeforeTest
public void login()
{
System.setProperty("webdriver.chrome.driver","D:\\WorkSpace_1\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://demo.vtiger.com");
}
@Test
public void enterData()
	{
driver.findElement(By.id("username")).sendKeys("admin");

driver.findElement(By.id("password")).sendKeys("admin");
}

@AfterTest
public void tearDown()
{
	driver.close();
}

}
