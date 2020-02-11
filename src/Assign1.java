import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assign1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement option1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		
		option1.click();
		Assert.assertTrue(option1.isSelected());
		
		option1.click();
		Assert.assertFalse(option1.isSelected());
		
		int count = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(count);
		Assert.assertEquals(count, 3);
		
	}

}
