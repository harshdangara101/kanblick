package smokeflow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginprocess {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "F:\\driver\\chromedriver-win64\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://kanblick-web-qa.vercel.app/en");
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//span[normalize-space()='Sign Up']")).click();  
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter Full Name']")).sendKeys("Tim cook");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter Phone Number']")).sendKeys("789797981");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter Email Address']")).sendKeys("herry306@mailinator.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter National ID']")).sendKeys("3353535513");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("Octal@123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter Confirm Password']")).sendKeys("Octal@123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        Thread.sleep(3000);
       
        //Next page integration 
        
        driver.findElement(By.xpath("//input[@value='company']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter Est. Number']")).sendKeys("23424242334");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[contains(@data-overlay-container,'true')]/div/div/div/div/div/div/form/div/div[2]/div[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='6787ae4da20bc3984f120176']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[contains(@data-overlay-container,'true')]/div/div/div/div/div/div/form/div/div[3]/div[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='677fa19a688e55fc726d3ece']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[contains(@for,'terms-checkbox')]//*[name()='svg']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Next']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
	}

}
