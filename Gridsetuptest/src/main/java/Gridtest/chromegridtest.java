package Gridtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class chromegridtest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

//1. Define desired capabiltiies		
DesiredCapabilities cap = new DesiredCapabilities();
cap.setBrowserName("chrome");
cap.setPlatform(Platform.LINUX);

//2. Chrome Options Definition
ChromeOptions options = new ChromeOptions();
options.merge(cap);

String huburl = "http://172.24.201.225:4446/wd/hub";
WebDriver driver = new RemoteWebDriver(new URL(huburl),options);

driver.get("https://www.google.com");
System.out.println(driver.getTitle());
	}

}
