import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarUI {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");

		// March 8
		driver.findElement(By.xpath("//div[@class='dF whiteBg col-sm-5 alignItemsCenter  col-md-2 ']")).click();
		
		//Month
		System.out.println(driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText());
		
	    while(!(driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText().contains("March 2020"))) {
			driver.findElement(By.cssSelector(".DayPicker-NavButton.DayPicker-NavButton--next")).click();
		}
		
		// Date
		List<WebElement> dates = driver.findElements(By.cssSelector(".calDate"));
		System.out.println(dates.size());
		
		for(int i=0; i<dates.size(); i++) {
			String date = dates.get(i).getText();
			if(date.equals("8")) {
				dates.get(i).click();
				break;
			}
		}		
	}

}
