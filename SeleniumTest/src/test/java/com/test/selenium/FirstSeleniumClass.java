package com.test.selenium;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeleniumClass {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver webdriver = new ChromeDriver();
		webdriver.get("https://www.google.com/");
		webdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  WebElement searchinput = webdriver.findElement(By.xpath(
		  "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		  searchinput.sendKeys("google");
		 
			/*
			 * WebDriverWait wait = new WebDriverWait(webdriver,30);
			 * wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(
			 * "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul")));
			 */	
			WebElement searchElement = webdriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul"));
		  List<WebElement> list = webdriver.findElements(By.tagName("li"));
		  
		  
		/*
		 * // Create the object of the Select class Select se = new
		 * Select(webdriver.findElement(By.xpath(
		 * "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul")));
		 * 
		 * // Select the option using the visible text se.selectByVisibleText("Google");
		 */
			
			
		
		  System.out.println("Auto Suggest List ::" + list.size());
		  for (WebElement option2 : list) {
			  System.out.println("1"+option2.getText()); //Prints “Option”, followed by “Not Option”
			  if(option2.getText().equalsIgnoreCase("Google")) {
				  System.out.println("option2222"+option2);
				  option2.click();
				  
			  }
		  }
			/*
			 * for(int i = 0 ;i< list.size();i++) {
			 * System.out.println(list.get(i).getText());
			 * 
			 * if(list.get(i).getText().equals("Google")) {
			 * System.out.println(""+list.get(i)); list.get(i).click(); break; } }
			 */
		 
		  
		//webdriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		
		/*
		 * WebElement scanEle =new WebDriverWait(webdriver,
		 * 20).until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")));
		 * Actions action =new Actions(webdriver);
		 * action.moveToElement(scanEle).click().build().perform();
		 */
		
		

	}

}
