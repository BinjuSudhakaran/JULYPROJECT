package mavenpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Saucedemopage1 
{
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"user-name\"]")
	WebElement name;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement pswd;

	@FindBy(xpath="//*[@id=\"login-button\"]")
	WebElement login;
	
	
	public Saucedemopage1(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setValues(String username,String password)
	{
		name.sendKeys(username);
		pswd.sendKeys(password);
	}
	public void login()
	{
		login.click();
	}
	public void cart()
	{
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
	}
	public void checkout()
	{
		driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("abc");
		driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("efg");
		driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		
	}
	public void end()
	{
		driver.findElement(By.xpath("//*[@id=\"cancel\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
	}
}


