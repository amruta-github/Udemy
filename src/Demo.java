import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo {

	public static void main(String[] args) {
		// Chrome Driver
		System.setProperty("webdriver.chrome.driver",".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Firefox Driver
		/*System.setProperty("webdriver.gecko.driver",".\\Softwares\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();*/
		
		//IE Driver
		/*System.setProperty("webdriver.ie.driver",".\\Softwares\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();*/
		
		//driver.get("http://google.com");  --> works fine
		//driver.get("www.google.com");  --> gives error
		//driver.get("http://www.google.com"); --> works fine
		//driver.get("http://www.kkkk.com"); --> This site can't be reached, server IP address could not be found
		driver.get("https://www.google.com");
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
		driver.quit();
		
		
		
	}

}
