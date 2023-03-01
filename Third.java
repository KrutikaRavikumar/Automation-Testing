import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Third {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//apple//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.cssSelector("#email")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("12345");

	}
}