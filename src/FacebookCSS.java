import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCSS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		//driver.findElement(By.cssSelector("*[id='email']")).sendKeys("amruta3");
		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("amruta3");
		
		driver.findElement(By.cssSelector("#pass")).sendKeys("1234567");
		
		driver.findElement(By.cssSelector("input[value='Log In']")).click();

	}

}
