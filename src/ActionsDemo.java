import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		System.out.println("WELCOME TO AMAZON!!");
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();

		WebElement move = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		
		//driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(Keys.SHIFT, "hello");
		// OR
		//a.moveToElement(move).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		a.moveToElement(move).click().keyDown(Keys.SHIFT).sendKeys("hello").contextClick().build().perform();

	}

}
