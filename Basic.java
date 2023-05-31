package Vtigercrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Basic {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
	   driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//span[@class='app-icon fa fa-bars']")).click();
	   WebElement marketing = driver.findElement(By.xpath("//span[text()='MARKETING']"));
	   Actions a=new Actions(driver);
	   a.moveToElement(marketing).perform();
	  basic type1
	}

}
