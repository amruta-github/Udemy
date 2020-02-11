import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableGrid {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/cricket-match/live-scores");
		
		driver.findElement(By.xpath("//nav[@class='cb-mat-mnu']/a[contains(text(),'Won')]")).click();
		driver.findElement(By.linkText("Scorecard")).click();

		WebElement table = driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		List<WebElement> rows = table.findElements(By.cssSelector(".cb-col.cb-col-100.cb-scrd-itms div:nth-child(3)"));
		
		WebElement extras = table.findElement(By.cssSelector(".cb-col.cb-col-8.text-bold.cb-text-black.text-right"));
		
		String totaltext = table.findElement(By.cssSelector(".cb-col.cb-col-8.text-bold.text-black.text-right")).getText();
		int expectedTotal = Integer.parseInt(totaltext);
				
		int actualTotal = 0;
		
		for(int i=0; i<(rows.size()-2); i++) {
			actualTotal = actualTotal + Integer.parseInt(rows.get(i).getText());
		}
		actualTotal = actualTotal + Integer.parseInt(extras.getText());
		
		System.out.println("Actual Total : " + actualTotal);
		System.out.println("Expected Total : " + expectedTotal);
		
		if(actualTotal == expectedTotal) {
			Assert.assertEquals(actualTotal, expectedTotal);
		}
	}
}
