import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class First {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","//Users//apple//Downloads//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
	driver.findElement(By.id("email")).sendKeys("This is my First Code");
	driver.findElement(By.name("pass")).sendKeys("12345");
	driver.findElement(By.linkText("Forgot account?")).click();
	}
}
