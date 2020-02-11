import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FollowingXPath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/v1/");
		
		System.out.println(driver.findElement(By.xpath("//label[starts-with(@id,'message')]")).getText());
		
		driver.findElement(By.xpath("//*[@type='text']/following::input")).sendKeys("1234");
		
		driver.findElement(By.xpath("//*[@type='submit']/preceding::input")).sendKeys("1234567");

		driver.get("http://demo.guru99.com/test/guru99home/");
		
		driver.findElement(By.xpath("//*[@id='rt-feature']/descendant::a")).click();
	}

}
