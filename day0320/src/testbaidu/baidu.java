package testbaidu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class baidu {
	WebDriver driver;
	@BeforeClass
	public void openfire() {
		System.setProperty("webdriver.chrome.driver", ".//toos//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="http://www.baidu.com";
		driver.get(url);
	}
	@Test
	public void bai() {
		driver.findElement(By.id("kw")).sendKeys("selenium");
		driver.findElement(By.id("su")).click();
	}
}

