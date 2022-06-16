package tokenlock;

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class homepage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Lokr\\chromedriver.exe");
			 ChromeOptions options = new ChromeOptions();
			options.addExtensions(new File("C:\\Users\\hp\\eclipse-workspace\\extension_10_8_1_0.crx"));
			options.setPageLoadStrategy(PageLoadStrategy.NONE);
			//WebDriver driver = new ChromeDriver(options);
		    //driver.get("https://polkalokr:Nothing@1@app-dev.polkalokr.com/");
			driver.get("https://vault-preprod.lokr.io/");
			driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
			ArrayList<String> MetaMaskHandles = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(MetaMaskHandles.get(0));
		    //driver.get("https://souq-staging.mrhb.network/");
		    //driver.findElement(By.className("customer-status-button")).click();
		    //driver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[2]/button[1]/span")).click();
		    //driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab))
		    //driver.findElement(By.cssSelector("#app-content > div > div.main-container-wrapper")).click();
			driver.findElement(By.xpath("//button[text()='Get Started']")).click();
		     
				
			}
  
		    
		}  
		
		



