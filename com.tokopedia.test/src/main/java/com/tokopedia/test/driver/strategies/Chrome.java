package com.tokopedia.test.driver.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.tokopedia.test.driver.strategies.DriverStrategy;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Chrome implements DriverStrategy{
	
	public WebDriver setStrategy() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("--no-sandbox");
		
		
		return new ChromeDriver(options);
	}
}