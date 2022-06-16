package tokenlock;

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Lokrnew {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver","C:/Users/hp/eclipse-workspace/Lokr/chromedriver.exe");
		//options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.addExtensions(new File("C:/Users/hp/eclipse-workspace/MetaMaskk.crx"));
		//options.setPageLoadStrategy(PageLoadStrategy.NONE);
		driver = new ChromeDriver(options);
		driver.get("https://vault-dev.lokr.io/ ");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		ArrayList<String> MetaMaskHandles = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(MetaMaskHandles.get(0));
		driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div/div[2]/div/div[2]/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div/div/div[5]/div[1]/footer/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div/form/div[4]/div[1]/div/input")).sendKeys("subway uncover vacant undo public theory device wrist key quote car odor");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("faisal123@$&");
		driver.findElement(By.xpath("//*[@id=\"confirm-password\"]")).sendKeys("faisal123@$&");
		driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div/form/div[7]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div/form/button")).click();
		driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"popover-content\"]/div/div/section/header/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[1]/div/div[2]/div[1]/div/span")).click();
		//driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div[1]/div[3]/span/a")).click();
		driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[3]/div/div[2]/div[2]/div[2]/div[7]/div[2]/div/div/div[1]/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[3]/div/div[1]/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[1]/div/div[2]/div[1]/div/span")).click();	
		driver.findElement(By.xpath("//*[@id='app-content']/div/div[2]/div/div[2]/li[4]/span")).click();
		//ArrayList<String> LokrMaskHandles = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(MetaMaskHandles.get(1));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div/div[2]/button/span")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[5]/div/div/div[2]/button/span")).click();
		Thread.sleep(7000);
		ArrayList<String> MetaMaskHandles1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(MetaMaskHandles1.get(2));
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div[2]/div[1]/div[2]")).getText());
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Connect']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Sign']")).click();
		//if(driver.findElements(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div[3]/button[2]")).size() != 0) {
			//driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div[3]/button[2]")).click();
		//}
		Thread.sleep(5000);
		driver.switchTo().window(MetaMaskHandles1.get(1));
		Thread.sleep(2000);
		if(driver.findElements(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[3]/button[1]/span")).size() != 0) {
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[3]/button[1]/span")).click();
		}
		Thread.sleep(3000);
		if(driver.findElements(By.xpath("//*[@id=\"app\"]/div/nav")).size() != 0) {
			//driver.findElement(By.xpath("//html/body/div/div[2]/div[2]/div[1]/button[1]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/nav")).click();
		}
		Thread.sleep(2000);
	    if(driver.findElements(By.xpath("//html/body/div/div[2]/div[2]/div[1]/button[1]")).size() != 0) {
			//driver.findElement(By.xpath("//html/body/div/div[2]/div[2]/div[1]/button[1]")).sendKeys("");
			driver.findElement(By.xpath("//html/body/div/div[2]/div[2]/div[1]/button[1]")).click();
	    }
		Thread.sleep(2000);
	    if(driver.findElements(By.xpath("//html/body/div/div[2]/div[2]/div[1]/button")).size() != 0) {
		    driver.findElement(By.xpath("//html/body/div/div[2]/div[2]/div[1]/button")).click();
	    }
	}

}
