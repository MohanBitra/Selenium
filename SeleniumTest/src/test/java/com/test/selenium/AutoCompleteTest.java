package com.test.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoCompleteTest {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32_2\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("selenium");
	
        List<WebElement> autoSuggest = driver.findElements(By.className("UUbT9"));
        Thread.sleep(3000);
      System.out.println("size--"+autoSuggest.size());
        // print the auto suggest
        for (WebElement a : autoSuggest)
        {
        	System.out.println("Values are = " + a.getText());
        	if (a.getText().equalsIgnoreCase("selenium webdriver"));
        	a.click();
        	Thread.sleep(3000);
        	break;
        }
        driver.close();
	}
}
