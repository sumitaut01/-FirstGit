package FirstGitPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FirstGitClassTest {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "G:\\chromedriver (2).exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		Actions a=new Actions(driver);
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		a.moveToElement(searchbox).click().keyDown(Keys.SHIFT).sendKeys("mouse").build().perform();
		
		
			
		driver.quit();
	  
	  
  }
}
