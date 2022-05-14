package basePack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import commons.CommonActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import objects.PayBill;

public class Basics {
	public static WebDriver driver;
	public PayBill payBill;
	public CommonActions commonActions;public Basics() {
	}
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.northwell.edu/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		initClasses();
		
	}
	@AfterMethod
	public void cleaningUp() {
		driver.quit();
	}
private void initClasses() {
	payBill = new PayBill(driver);
	commonActions = new CommonActions();
}
}
