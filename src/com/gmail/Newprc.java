package com.gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Newprc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver = new FirefoxDriver();
      
      driver.get("https://www.facebook.com/");
      
      System.out.println(driver.getTitle());
		
		
		
	}

}
