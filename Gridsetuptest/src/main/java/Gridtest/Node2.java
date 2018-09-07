package Gridtest;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Node2 {
	
	
  @Test
  public void f() throws MalformedURLException {
	
		  DesiredCapabilities cap = DesiredCapabilities.firefox();
		  cap.setBrowserName("firefox");
		  cap.setPlatform(Platform.LINUX);

		  //2. Chrome Options Definition
		  FirefoxOptions options = new FirefoxOptions();

		  String huburl = "http://172.24.201.225:4446/wd/hub";
		  WebDriver driver = new RemoteWebDriver(new URL(huburl),options);

		  driver.get("https://www.google.com");
}
}
