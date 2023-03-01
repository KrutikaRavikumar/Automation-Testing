import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Second {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//apple//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.name("pw")).sendKeys("12345");
		driver.findElement(By.className("button")).click();
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
	}
}