import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		WebElement table = driver.findElement(By.cssSelector("#product"));
		int rowcount = table.findElements(By.tagName("tr")).size();
		System.out.println("Number of rows : " + rowcount);
		
		int columncount = table.findElements(By.tagName("th")).size();
		System.out.println("Number of Columns : " + columncount);
		
		List <WebElement> tds = table.findElements(By.xpath("//tbody/tr[3]/td"));
		for(int i=0; i< columncount; i++) {
			System.out.println(tds.get(i).getText());
		}
	}

}
