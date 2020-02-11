import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackToParent {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Immediate Parent
		driver.get("https://www.rahulshettyacademy.com/#/index");
		//driver.findElement(By.linkText("About")).click();
		System.out.println(driver.findElement(By.xpath("//li[@class='current']/parent::ul")).getAttribute("class"));

	}

}
