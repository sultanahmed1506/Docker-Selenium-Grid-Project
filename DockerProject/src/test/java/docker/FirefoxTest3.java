package docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FirefoxTest3 {
	@Test
	public void testFF3() throws MalformedURLException {
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		//URL url = new URL("http://3.19.240.42:4444/grid/console");
		URL url = new URL("http://18.219.245.253:4444/wd/hub");
		
		
		RemoteWebDriver driver = new RemoteWebDriver(url,dc);
		driver.get("https://www.ca.kayak.com/");
		System.out.println("Title of the Page : "+driver.getTitle());
		driver.quit();	
		
	}

}
