package TestNGBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class parallelTestingInTestNG {

    WebDriver driver;

    @Test
    public void method1() {
        // Open browser
        driver = new ChromeDriver();
        // Open URL
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    }

    @Test
    public void method2() {
        // Open browser
        driver = new ChromeDriver();
        // Open URL
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    }

    @AfterMethod
    public void closeBrowser() {
        // Close browser
        driver.close();
        //driver.quit();
    }

}
