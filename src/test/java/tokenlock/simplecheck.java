package tokenlock;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class simplecheck {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Lokr\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addExtensions(new File("C:\\Users\\hp\\eclipse-workspace\\extension_10_8_1_0.crx"));
			WebDriver driver = new ChromeDriver();
		    driver.get("https://polkalokr:Nothing@1@app-dev.polkalokr.com/");
			//driver.get("https://souq-staging.mrhb.network/");
		    //driver.findElement(By.className("customer-status-button")).click();
		    //driver.findElement(By.xpath("//*[@id=\"root\"]']")).click();



			}

}
