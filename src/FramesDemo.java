import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");

		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		
		int count = driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0);
		
		WebElement source = driver.findElement(By.id("draggable"));	
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
	}

}
