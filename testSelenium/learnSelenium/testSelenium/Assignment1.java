package learnSelenium.testSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment1 {
  @Test
  public void Assignment1() {
	  
	  System.setProperty("WebDriver.Chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//webdriver.navigate().to("https:\\facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.tagName("input")).sendKeys("Way2Automation");
	
		
  }
}
