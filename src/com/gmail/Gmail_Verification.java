package com.gmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Verification {
	public void verification() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com");
		driver.findElement(By.id("identifierId")).sendKeys("veeramohan4536");
		driver.findElement(By.xpath("//*[@class='RveJvd snByac']")).click();
		String test = driver.findElement(By.xpath("//*[@class='dEOOab RxsGPe']")).getText();
		// System.out.println(test);
		if (test.contains("Couldn't find your Google Account")) {
			System.out.println("invalid Mail");
		} else {
			System.out.println("valid Mail");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gmail_Verification g = new Gmail_Verification();
		g.verification();

	}

}
