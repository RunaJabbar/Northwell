package testPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTestingMain {

	public static void main(String[] args) {
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\pwinc\\eclipse-workspace\\SeleniumMethods\\driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://lij.northwell.edu/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement element = driver.findElement(By.id("//*[@id='accessible-megamenu-1652213742434-5']"));
		element.click();
		WebElement element2 = driver.findElement(By.className("//i[@class='fal fa-notes-medical accessible-megamenu-sub-nav']"));
		element.click();
	}
}
