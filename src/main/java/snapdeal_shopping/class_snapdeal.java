package snapdeal_shopping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class class_snapdeal {
	
	@Test
	public void open_snapdeal() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement searchBox=driver.findElement(By.xpath("//input[@placeholder='Search products & brands']"));
		searchBox.sendKeys("saree");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']")).click();
	}

}
