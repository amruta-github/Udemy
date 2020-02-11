import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys("ind");
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Keys.DOWN);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script = "return document.getElementById('autocomplete').value";
		String text = (String) js.executeScript(script);
		
		while(!text.equalsIgnoreCase("India")) {
			driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
		}
	}

}
