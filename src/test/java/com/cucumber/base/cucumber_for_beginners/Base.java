package com.cucumber.base.cucumber_for_beginners;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	public static Properties prop;

	public static WebDriver getDriver() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/test/java/com/cucumber/base/cucumber_for_beginners/global.properties");
		prop.load(fis);

		System.setProperty("webdriver.chrome.driver","resource_created/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		return driver;

	}

}
