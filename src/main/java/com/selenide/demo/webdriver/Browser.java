package com.selenide.demo.webdriver;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	private static WebDriver webDriver;

	public static WebDriver getDriver() {
		return webDriver;
	}

	private static void setDriver(WebDriver driver) {
		webDriver = driver;
	}

	private static void loadDriver() {
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		setDriver(driver );
		WebDriverRunner.setWebDriver(driver);
	}
}
