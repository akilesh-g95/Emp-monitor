package attendancefeature.EMPMonitor;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CheckinandCheckout {

	WebDriver driver;

	@Test(priority = 1)
	public void checkin() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://app.empmonitor.com/login");
		driver.findElement(By.id("email")).sendKeys("akileshg@globussoft.in");
		driver.findElement(By.id("password")).sendKeys("Ake@$%24RYe");
		driver.findElement(By.id("LoginDash2")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[text()=\"HRMS\"]")).click();

		String text = driver.getWindowHandle();
		System.out.println(text);
		
		Thread.sleep(3000);
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		
		
		for (String window : allWindows) {
			if (!window.equals(parentWindow)) {

				System.out.println(window);
				driver.switchTo().window(window);

			}
		}
		Thread.sleep(3000);
		driver.findElement(By.id("clock_in")).click();

	}

	@Test(priority = 2)
	public void checkout() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://app.empmonitor.com/login");
		driver.findElement(By.id("email")).sendKeys("akileshg@globussoft.in");
		driver.findElement(By.id("password")).sendKeys("Ake@$%24RYe");
		driver.findElement(By.id("LoginDash2")).click();

		driver.findElement(By.xpath("//*[text()=\"HRMS\"]")).click();

		String text = driver.getWindowHandle();
		System.out.println(text);
		
		
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for (String window : allWindows) {
			if (!window.equals(parentWindow)) {

				System.out.println(window);
				driver.switchTo().window(window);

			}
		}

		driver.findElement(By.id("clock_in")).click();

		Thread.sleep(3000);

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
