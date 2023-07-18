package demo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
//Selenium Imports
import org.openqa.selenium.Keys;
// import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
///

public class TestCases {
    ChromeDriver driver;

    public TestCases() {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest() {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();
    }

    public void testCase01() throws InterruptedException {
        System.out.println("Start Test case: testCase01");
        // TestCases testCase = new TestCases();
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("amazon");
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//input[@class='gNO89b'])[1]")).click();
        Thread.sleep(2000);
        String text = driver.findElement(By.xpath("//div[@class='d8lRkd']/span/span[2]/span/div/span")).getText();
        if (text.equals("Amazon.in")) {
            System.out.println("getting the amozon content page");
        } else {
            System.out.println("not getting amazon content page");
        }
        System.out.println("end Test case: testCase01");
        // testCase.endTest();
    }

}
