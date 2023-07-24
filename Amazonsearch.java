package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
//Selenium Imports
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
///

import com.google.common.base.Verify;


public class Amazonsearch {
    ChromeDriver driver;
    public Amazonsearch()
    {
        System.out.println("Constructor: TestCases");
         WebDriverManager.chromedriver().timeout(30).setup();
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }



    
    public  void testCase01(){
//Visit Google.com  driver.get ("https://google.com")
  driver.get("https://www.google.com");
// Find locator for Search Using Locator "XPath" //textarea[@title='Search']
WebElement searchBox = driver.findElement(By.xpath("//textarea[@aria-label='Search']"));
searchBox.sendKeys("Amazon");
// Hit Enter using key strokes
searchBox.sendKeys(Keys.ENTER);
// Open page source  Using Locator "Partial Link Text" Contains Amazon.in
boolean AmazonIn = driver.getPageSource().contains("amazon.in");
boolean AmazonCom = driver.getPageSource().contains("amazon.com");
//Verify the test results
if (AmazonIn || AmazonCom) {
    System.out.println("Amazon is returned in the search results.");
} else {
    System.out.println("Amazon is not returned in the search results.");
}
//Close the browser
driver.quit();

        
    }

    //     public void endTest()
    // {
    //     System.out.println("End Test: TestCases");
    //     driver.close();
    //     driver.quit();

    // }


}
