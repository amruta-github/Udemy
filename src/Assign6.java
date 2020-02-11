import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
		checkbox.click();
		
		String labeltext = driver.findElement(By.xpath("//input[@id='checkBoxOption2']/..")).getText();
				
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		dropdown.click();
		
		Select s = new Select(dropdown);
		s.selectByVisibleText(labeltext);
		
		driver.findElement(By.id("name")).sendKeys(labeltext);
		driver.findElement(By.id("alertbtn")).click();
		
		Alert alert = driver.switchTo().alert();
		String alerttext = alert.getText();
		System.out.println(alerttext);
		
		if(alerttext.contains(labeltext)) {
			System.out.println("Text is present");
		} else {
			System.out.println("Text is not present");
		}
		
	}

}
