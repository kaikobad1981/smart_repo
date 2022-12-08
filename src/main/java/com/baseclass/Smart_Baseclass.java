package com.baseclass;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Smart_Baseclass {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "./Driver/ChromeDriver.exe");
//        WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://smarttechqa.com/");
		driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div/a[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kaikobad67@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div/div/form/button")).click();
		
//		driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div/a[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kaikobad67@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
//		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div/div/form/button")).click();
//		
//		
		//System.out.println("Title of the test is :"+driver.getTitle());
		String expected= "LATEST PRODUCTS";
		Assert.assertEquals(expected, "LATEST PRODUCTS");
		driver.quit();
		


		
	}

}
