import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
	
		WebElement ele = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		
		Select s = new Select(ele);
		//s.selectByValue("USD");
		//s.selectByIndex(3);
		s.selectByVisibleText("USD");
		
	}

}
