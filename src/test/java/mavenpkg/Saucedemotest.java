package mavenpkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Saucedemotest
{
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws Exception
	{
		Saucedemopage sd=new Saucedemopage(driver);
		
		
		FileInputStream ob=new FileInputStream("C:\\Users\\dell\\OneDrive\\Desktop\\Book2.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(ob);
		XSSFSheet sh=wb.getSheet("sheet1");
		int row=sh.getLastRowNum();
	
		for(int i=1;i<=row;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			
			String password=sh.getRow(i).getCell(1).getStringCellValue();
			
			
			sd.setValues(username, password);
			sd.login();
			Thread.sleep(3000);
			driver.navigate().refresh();
			
			
		}
		String actual=driver.getCurrentUrl();
		String exp="https://www.saucedemo.com/inventory.html";
		if(actual.equals(exp))
		{
			System.out.println("Login Successful");
			sd.cart();
			sd.checkout();
			sd.end();
			
		}
		else
		{
			System.out.println("Failed");
		}
	}
	
}
