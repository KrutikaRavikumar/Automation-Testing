import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//apple//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://spicejet.com");
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		driver.findElement(By.cssSelector("input[id='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
	}

}
