package mavenpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Saucedemopage
{
	WebDriver driver;
	By name=By.xpath("//*[@id=\"user-name\"]");
	By pswd=By.xpath("//*[@id=\"password\"]");
	By login=By.xpath("//*[@id=\"login-button\"]");
	public Saucedemopage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setValues(String username,String password)
	{
		driver.findElement(name).sendKeys(username);
		driver.findElement(pswd).sendKeys(password);
	}
	public void login()
	{
		driver.findElement(login).click();
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
		driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();//*[@id="logout_sidebar_link"]
	}
}
