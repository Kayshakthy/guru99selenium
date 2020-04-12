package guru999.gittest1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AppTest1 {
	protected WebDriver driver;
  @Test
  public void f() {
  }
	@Test
	public void guru99tutorials() throws InterruptedException{
		String driverPath = "C:\\Users\\kirushakthy\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		ChromeDriver driver = new ChromeDriver();  
		
		String baseUrl = "http://www.guru99.com/";
		String eTitle = "Meet Guru99";
		String aTitle = "";
		driver.get(baseUrl);
		
		aTitle = driver.getTitle();
		System.out.println(" aTitle	: " + aTitle);
		if(eTitle.contentEquals(aTitle)) {
			System.out.println("Test passed");
			
		}else {
			System.out.println("Test failed");
			System.out.println(" aTitle	: " + aTitle);
		}
		//close the chrome driver
		driver.close();
	}
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
