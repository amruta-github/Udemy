import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.findElement(By.cssSelector("#username")).sendKeys("amruta");
		
		//class="input r4 wide mb16 mt8 password"
		driver.findElement(By.cssSelector(".input.r4.wide.mb16.mt8.password")).sendKeys("1234");
		driver.findElement(By.cssSelector("#Login")).click();
		
		//System.out.println(driver.findElement(By.xpath("//label[text()='Password']")).getText());
		
		//System.out.println(driver.findElement(By.cssSelector("//label[text()='Password']")).getText());
		
	}

}
