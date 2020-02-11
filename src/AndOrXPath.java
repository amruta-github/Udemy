import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AndOrXPath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("   http://demo.guru99.com/v1/"); // works fine
		/*driver.findElement(By.xpath("//input[@type='submit' and @name='btnLogin']")).click(); // and small case must
		driver.navigate().back();*/
		
		driver.findElement(By.name("uid")).sendKeys("abcd");
		driver.findElement(By.name("password")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@type='reset' or @name='btnReset']")).click(); // or small case must 
		
		System.out.println(driver.findElement(By.xpath("//*[text()='Password']")).getText());
		
		System.out.println("GENERATING GIT DEMO 1");
		System.out.println("GENERATING GIT DEMO 2");
	}

}
