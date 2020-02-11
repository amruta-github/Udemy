import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		String text = "Amruta";
		
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		Thread.sleep(3000);
		al.accept();
		
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(3000);
		al.dismiss();
		
		System.out.println("POPUPS!!");
	}

}
