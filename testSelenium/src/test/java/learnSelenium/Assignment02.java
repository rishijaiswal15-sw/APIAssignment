package learnSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Assignment02 {
  @Test
  public void assignmet02() {
	  
	  System.setProperty("WebDriver.Chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qa.way2automation.com");
		WebDriverWait wait=new WebDriverWait(driver,20);
		
		driver.manage().window().maximize();
		WebElement countryDropdown=driver.findElement(By.name("country"));
		Select country=new Select(countryDropdown);
		List<WebElement> registrationForm=driver.findElements(By.className("popupbox"));
		WebElement username=driver.findElement(By.name("username"));
		
		
		
		System.out.println(username.getTagName());
		
		//registrationForm.findElement(By.name("username")).sendKeys("asdasfwefw");
		driver.findElement(By.name("name")).sendKeys("Test");
		driver.findElement(By.name("phone")).sendKeys("9876543210");
		driver.findElement(By.name("email")).sendKeys("testUser@test.com");
		driver.findElement(By.name("city")).sendKeys("Kabul");
		country.selectByValue("Afghanistan");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//wait.until(ExpectedConditions.elementToBeSelected(By.xpath("/html/body/div[4]/div/div/div/div/div/form/fieldset[6]/input")));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div/div/div/div/div/form/fieldset[6]/input"))).sendKeys("testUser");;
		//driver.findElement(By.xpath("(//fieldset/input[contains(@name,'username')])[2]")).sendKeys("testUser");
		//driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/form/fieldset[7]/input")).sendKeys("abcdefgh");
		//username.sendKeys("abc");
		//System.out.println("Attribute text is :"+registrationForm.getText());
		for(WebElement ele: registrationForm) {
			//System.out.println(ele.getText());

			System.out.println("Attribute text is :"+ele.getAttribute("name"));
			if(ele.getAttribute("name")=="username")
			{
				System.out.println("Attribute text is :"+ele.getText());
				System.out.println("inside loop............");
				System.out.println("current element is "+ ele.getAttribute("name"));
				
				//username=ele;
				
				//ele.sendKeys("asdsaedrfwe");
				username.sendKeys("Geeta");
				
			//System.out.println(ele.getText());
				
				break;
			}
			else
				continue;
			
		}
		
		
		//driver.findElement(By.xpath("//*[@id=\"load_form\"]/div[1]/div[2]/input")).click();
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"load_form\"]/div[1]/div[2]/input"))).click();
	
		

		//driver.close();
		//driver.quit();
  }
}
