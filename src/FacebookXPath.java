import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXPath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("amruta2");
		driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("123456");
		
		driver.findElement(By.xpath("//input[@value='Log In']")).click();

	}

}
