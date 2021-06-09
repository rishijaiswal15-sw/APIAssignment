package learnSelenium.testSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestMyClass {

	@Test
	public void testMethod()
	{
		//WebElement dropDownn;
		System.setProperty("WebDriver.Chrome.driver", "D:\\chromedriver.exe");
		WebDriver webdriver=new ChromeDriver();
		webdriver.get("https://www.wikipedia.org/");
		//webdriver.navigate().to("https:\\facebook.com");
		webdriver.manage().window().maximize();
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebDriverWait wait=new WebDriverWait(webdriver,10);
		String title=webdriver.getTitle();
		String url=webdriver.getCurrentUrl();
	System.out.println("Title: "+title);
	System.out.println("URL: "+url);
	webdriver.getCurrentUrl();
	
	WebElement dropDown=webdriver.findElement(By.id("searchLanguage"));
	

	//webdriver.quit();
	//assert title.equalsIgnoreCase("Rahul Shetty Academy");	
	//assert url.contentEquals("https://rahulshettyacademy.com");
	//assert url.contentEquals("https://rahulshettyacademy.com");
	//assert url.contains("https://rahulshettyacademy.com");
	
	System.out.println(webdriver.findElement(By.className("footer")).isDisplayed());
	
	WebElement footer=webdriver.findElement(By.className("footer"));
	List<WebElement> footerLinks=footer.findElements(By.tagName("a"));
	Select select1=new Select(dropDown);
	select1.selectByValue("hi");	
	List<WebElement> values=webdriver.findElements(By.tagName("option"));
	List<WebElement> values1=select1.getOptions();

List<WebElement> links=webdriver.findElements(By.tagName("a"));
System.out.println("Total Links="+links.size());

	//select1.deselectByIndex(0);
	//select1.selectByIndex(0);
	//select1.selectByVisibleText("English");
	for(int i=0;i<values1.size();i++) {
		System.out.println(values1.get(i).getAttribute("lang"));
		System.out.println(values1.get(i).getText());
	}
	
	for (int i=0;i<links.size();i++) {
		System.out.println(links.get(i).getText());
	}
	
	System.out.println("------------------------------------------------------\nFooter URLs");
	for (int i=0; i<footerLinks.size();i++) {
		System.out.println("Text: "+footerLinks.get(i).getText()+" URL: "+footerLinks.get(i).getAttribute("href"));
	}
	webdriver.close();
	webdriver.quit();
	}
	
}
