package attendancefeature.EMPMonitor;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class makemytrip {

	WebDriver driver;

	@Test
	public void gettextfromsuggestions() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.makemytrip.com/");

		driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]")).click();

		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(3000);

		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox']//li"));

		for (WebElement webElement : suggestions) {
			System.out.println(webElement.getText());
		}
	}

	@Test
	public void dynamicsearch() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.makemytrip.com/");

		driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]")).click();
		Thread.sleep(2000);

		WebElement frombutt = driver
				.findElement(By.xpath("//span[@class=\"lbl_input appendBottom10\"][text()=\"From\"]"));
		frombutt.click();
		Thread.sleep(2000);

//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@class=\"react-autosuggest__input react-autosuggest__input--open\"][@placeholder=\"From\"]")));

		WebElement inputtext = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));

		String searchcity = "pune";
		inputtext.sendKeys(searchcity);
		Thread.sleep(2000);

		searchcityonyourchoice(driver, searchcity);

	}

	public void searchcityonyourchoice(WebDriver driver, String searchcity) throws InterruptedException {

		List<WebElement> ListofSuggestions;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		boolean cityFound = false;
		int maxScrollAttempts = 5;

		for (int i = 0; i < maxScrollAttempts; i++) {
			ListofSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']//li"));

			for (WebElement suggestion : ListofSuggestions) {

				if (suggestion.getText().toLowerCase().contains(searchcity.toLowerCase())) {
					suggestion.click();
					System.out.println("The Entered city is " + suggestion.getText());
					cityFound = true;
					return;

				}
				 if (!cityFound) {
		                js.executeScript("arguments[0].scrollIntoView(true);", ListofSuggestions.get(ListofSuggestions.size() - 1));
		                Thread.sleep(1000); // Wait for new options to load
		            }
		        
				
				if (!cityFound) {
					System.out.println("City not found in the suggestions.");
				}

			}

		}
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
