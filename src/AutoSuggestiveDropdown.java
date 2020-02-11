import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/");
		
		driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys("BENG");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys(Keys.DOWN);
		/*String actualDest = driver.findElement(By.cssSelector("#fromPlaceName")).getText();
		System.out.println(actualDest);*/
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script = "return document.getElementById(\"fromPlaceName\").value";
		String text = (String) js.executeScript(script);
		
		int i=0;
		
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")) {
			i++;
			driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			
			if(i>10) {
				break;
			}
		}
		if(i>10) {
			System.out.println("Value not present");
		}
	}
}
