import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","//Users//apple//Downloads//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://spicejet.com");
		driver.findElement(By.id("")).click();
		
		
		
		
	}
}
