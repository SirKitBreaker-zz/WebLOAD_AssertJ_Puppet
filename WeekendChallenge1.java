package ibm_lvc_sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WeekendChallenge1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		//Open browser
		driver.get("https://www.google.com");
		
		//Find search field and type 'Cheese'
		driver.findElement(By.name("q")).sendKeys("Cheese");
		//driver.findElement(By.name("q")).sendKeys("Cheese", Keys.RETURN);
		
		//Find and click the search button
		WebElement searchButton = driver.findElement(By.xpath("//input[@value='Google Search']"));
		
		//Wait for the button to be clicked
		wait.until(ExpectedConditions.elementToBeClickable(searchButton));
		searchButton.click();
		
		//Wait for results to load
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("result-stats")));
		
		//Find and print the number of results
		String results = driver.findElement(By.id("result-stats")).getText();
		System.out.println("Number of resutls: " + results);
		
		//Find and click the third result link
		WebElement thirdLink = driver.findElement(By.xpath("//div[@class='srg']/div[@class='g'][3]//div[@class='r']/a"));
		thirdLink.click();
		
		//Wait for new page to load
		wait.until(ExpectedConditions.titleContains("Cheese.com"));
		
		//Print page title
		System.out.println("New page title is: " + driver.getTitle());
		
		//Close browser
		driver.close();

	}

}