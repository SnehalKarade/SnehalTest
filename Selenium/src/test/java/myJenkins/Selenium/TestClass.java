package myJenkins.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
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
driver.get("https://labs.abeautifulsite.net/archived/jquery-multiSelect/demo/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
@Test
public void enterData()
	{
WebElement mutiselect = driver.findElement(By.id("control_6"));
	
	Select objMultiselect = new Select(mutiselect);
	
	objMultiselect.selectByIndex(1);
	objMultiselect.selectByValue("option_3");
	objMultiselect.selectByVisibleText("Option 2");
	
	List<WebElement> selectedOptions = objMultiselect.getAllSelectedOptions();
	
	int size = selectedOptions.size();
	System.out.println(size);
	
	for(int i = 0;i<size;i++) {
		
		System.out.println("Selected option "+i+" : " +selectedOptions.get(i).getText());
	}
	
	objMultiselect.deselectAll();
   System.out.println("SK");
   System.out.println("Testing done");
}

@AfterTest
public void tearDown()
{
	driver.close();
	
}

}
