import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App_Veg {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//apple//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		String[] names = { "Cucumber", "Brocolli" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText();
			if (name.contains("Cucumber"))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			break;
		}

	}
}
}