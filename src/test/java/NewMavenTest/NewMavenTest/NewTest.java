package NewMavenTest.NewMavenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  @Test(priority = 1)
  public void launchApp() {
	  driver = new FirefoxDriver();
	  driver.get("https://flipkart.com");
	  driver.manage().window().maximize();
	  String s = driver.getTitle();
	  System.out.println(s); 
  }
  @Test(priority = 2)
  public void login() {
	  driver.findElement(By.xpath("abc")).click();
  }
  @Test(priority = 3)
  public void logout() {
	  driver.findElement(By.name("xyz")).click();
  }
  @Test(priority = 4)
  public void terminate() {
	  driver.quit();
  }
  
}
