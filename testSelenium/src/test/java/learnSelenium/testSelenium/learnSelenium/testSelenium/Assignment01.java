package learnSelenium.testSelenium.learnSelenium.testSelenium;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment01 {
  @Test
  public void assignment01() {
	  
	  System.setProperty("WebDriver.Chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//webdriver.navigate().to("https:\\facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.tagName("input")).sendKeys("Way2Automation");
		driver.findElement(By.name("btnK")).click();
		//List<WebElement> searchResults=driver.findElements(By.tagName("a"));
		driver.findElement(By.xpath("/html/body/div[7]/div/div[9]/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div[1]/a[1]/h3")).click();
		List<WebElement> linksOnWebpage=driver.findElements(By.tagName("a"));
		System.out.println("Total Links are: "+linksOnWebpage.size());
		
		for(WebElement links: linksOnWebpage) {
			System.out.println("Text: "+links.getText()+" URL: "+links.getAttribute("href"));
		}
		
		driver.close();
		driver.quit();
  }
}
