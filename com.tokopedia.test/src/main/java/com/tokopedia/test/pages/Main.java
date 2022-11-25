package com.tokopedia.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tokopedia.test.driver.DriverSingleton;

public class Main {
	
private WebDriver driver;
	
	public Main() {
		this.driver=DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"header-main-wrapper\"]/div[2]/div[2]/div/div/div/div/input")
	private WebElement search;

	@FindBy(xpath="//*[@id=\"zeus-root\"]/div/div[2]/div/div[2]/div[3]/div[1]/div[1]/div/div/div/div/div/div[2]/a/div[1]")
	private WebElement product;
	
	@FindBy(xpath="//*[@id=\"pdpBuyerSubActions\"]/div/button[2]")
	private WebElement wishlist;

	public void clicksearchbox() {
		search.click();
	}
	
	public void clickproduct() {
		product.click();
	}
	
	public void wishlist() {
		wishlist.click();
	}
	
	static void delay(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
}
}
