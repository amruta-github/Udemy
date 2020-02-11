import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> ids = driver.getWindowHandles();
		
		Iterator<String> id = ids.iterator();
		
		String parentid = id.next();
		String childid = id.next();
		
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
	}

}
