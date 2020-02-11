import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DisabledOrOpacity {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		//WebElement date2 = driver.findElement(By.id("ctl00_mainContent_view_date2"));
		//System.out.println(date2.isEnabled());
		
		WebElement date2 = driver.findElement(By.id("Div1"));
		
		WebElement roundtrip = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
		roundtrip.click();
		
		if(date2.getAttribute("style").contains("opacity: 1")){
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		//System.out.println(date2.isEnabled());

	}

}
