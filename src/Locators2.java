import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		//driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("hi");
		
		//driver.findElement(By.name("pw")).sendKeys("1234");
		driver.findElement(By.cssSelector("#password")).sendKeys("12345");
		
		//driver.findElement(By.className("button r4 wide primary")).click(); // compound classes not allowed with className locator
		driver.findElement(By.cssSelector("#Login")).click();
		
		String loginError = driver.findElement(By.cssSelector("div#error.loginError")).getText();
		System.out.println(loginError);
	}
}
