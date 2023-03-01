import org.openqa.selenium.chrome.ChromeDriver;
public class Demo {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","//Users//apple//Downloads//chromedriver");
ChromeDriver driver=new ChromeDriver();
driver.get("http://google.com");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getPageSource());
driver.get("http://yahoo.com");
driver.navigate().back();
driver.close();
	}
}
