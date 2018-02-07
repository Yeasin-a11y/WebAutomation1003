package abc_practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailtest {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		 System.setProperty("webdriver.chrome.driver", "C:/Users/Yeasi/Desktop/chromedriver.exe");
			WebDriver driver =new ChromeDriver ();
//navigator URL
			driver.navigate().to("https://mail.google.com");
			Thread.sleep(10000);
//enter Email ID
			driver.findElement(By.cssSelector("#identifierId")).sendKeys("gmaitest07@gmail.com");
			Thread.sleep(10000);
// click on next button
			driver.findElement(By.cssSelector("#identifierNext")).click()	;
			
			Thread.sleep(10000);
			
// enter password
			driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("icterguru");
// click sign in 
			driver.findElement(By.cssSelector("#passwordNext > content")).click()	;
			Thread.sleep(10000);
			driver.close();
			driver.quit();
	}

}
