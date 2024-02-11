package VariousConcept;



import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LunchBrowser {
	WebDriver driver;
	/*public  void main(String[] args) {
		
		//Scanner scn = new Scanner(System.in);
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\mustafa\\Selenium\\crm\\driver\\chromedriver.exe");
		// System.out.println("what browser you wanna go to :");
		// String url = scn.nextLine();
		//WebDriver driver = new ChromeDriver();
		
		//driver.manage().deleteAllCookies(); 
	//	driver.get("https://"+url+".com");
     	//driver.get("https://codefios.com/ebilling/login");
		//driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
		//driver.findElement(By.id("password")).sendKeys("abc123");
		//driver.findElement(By.id("login_submit")).click();
		// driver.close();
		
		
	}*/
	@After
	public  void teardown () {
		driver.close();
	}
	
	@Before
	public  void inet() {
		driver = new ChromeDriver();
		//lunching browser
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver.get("https://codefios.com/ebilling/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public  void positlogintest() {
		driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.id("login_submit")).click();
	}
    public  void negativlogintest() {
    	driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
		driver.findElement(By.id("password")).sendKeys("abc123wvwvw");
		driver.findElement(By.id("login_submit")).click();
	}
}
 // Maven is a project managment tool