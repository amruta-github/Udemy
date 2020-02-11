import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifySiblings {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Going forward
		//driver.get("http://www.qaclickacademy.com/");
		//driver.findElement(By.xpath("//li[@class='active']/following-sibling::li[2]")).click();

		//Going backward
		driver.get("https://www.rahulshettyacademy.com/#/index");
		driver.findElement(By.linkText("About")).click();
		driver.findElement(By.xpath("//li[@class='current']/preceding-sibling::li[2]")).click();
	}

}
