import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Nested Frames")).click();
		
		driver.switchTo().frame("frame-top");
		//int count = driver.findElements(By.tagName("frame")).size();
		//System.out.println(count);
		
		driver.switchTo().frame("frame-middle");
		
		System.out.println(driver.findElement(By.cssSelector("#content")).getText());

	}

}
