package tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takescreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver(); 
		
		
	    driver.get("https://www.google.com");
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src =ts.getScreenshotAs(OutputType.FILE);
		
		File dest  = new File(".//Screenshots//HomePage.png");
		
	
		 FileUtils.copyFile(src, dest);
		 
	}

}
