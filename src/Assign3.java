import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		driver.findElement(By.linkText("Click to load get data via Ajax!")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#results")));
		System.out.println(driver.findElement(By.cssSelector("div#results")).getText());

	}

}
