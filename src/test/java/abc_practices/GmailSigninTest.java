package abc_practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailSigninTest {

	public static void main(String[] args) throws InterruptedException {
	
		 System.setProperty("webdriver.chrome.driver", "C:/Users/Yeasi/Desktop/chromedriver.exe");
		WebDriver driver =new ChromeDriver ();
driver.get("https://www.google.com");


driver.findElement(By.id("gb_70")).click();



WebElement email_phone = driver.findElement(By.xpath("//input[@id='identifierId']"));
email_phone.sendKeys("yeasinraghib@gmail.com");
driver.findElement(By.id("identifierNext")).click();
Thread.sleep(4000);
WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
WebDriverWait wait = new WebDriverWait(driver, 20);
wait.until(ExpectedConditions.elementToBeClickable(password));
password.sendKeys("tfuyirfiu");
driver.findElement(By.id("passwordNext")).click();; 



Thread.sleep(4000);
	}

}
