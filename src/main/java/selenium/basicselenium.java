package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class basicselenium {
	public static void main(String[] args) {
		// webdriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MARIVEL\\eclipse-workspace\\SWD_Locators\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mycontactform.com/samples.php");
		//checkbox
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.xpath("//input[@value='0']")).click();
		//textbox
	
		driver.findElement(By.id("subject")).sendKeys("marivel912000@gmail.com");
		String text=driver.findElement(By.id("subject")).getAttribute("value");
		System.out.println(text);
		
}
}