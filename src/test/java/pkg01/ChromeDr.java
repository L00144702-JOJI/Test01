package pkg01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDr {
	
	public static void ChromeDr() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://www.amazon.in/");
	
	}

}
