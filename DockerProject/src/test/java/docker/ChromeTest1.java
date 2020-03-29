package docker;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTest1 {
	@Test
	public void testCR1() throws MalformedURLException {
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		//URL url = new URL("http://3.19.240.42:4444/grid/console");
		URL url = new URL("http://18.219.245.253:4444/wd/hub");
		
		RemoteWebDriver driver = new RemoteWebDriver(url,dc);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Title of the Page : "+driver.getTitle());
		driver.quit();	
		
	}

}
