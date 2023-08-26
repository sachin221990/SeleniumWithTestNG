package TestNGBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertionInTestNG {

    @Test
    public void login() throws InterruptedException {

        // Open browser
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        // Open URL
        driver.get("https://login.salesforce.com/?locale=in");

        // Locate username
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        //Locate password
        WebElement password = driver.findElement(By.xpath("//input[@name='pw']"));
        //Enter Username
        username.sendKeys("Test");
        //Enter Password
        password.sendKeys("Test11");

        //Click on login button
        driver.findElement(By.id("Login")).click();
        //Hard Assertion
        String actualText=driver.findElement(By.xpath("//div[@id=\"error\"]")).getText();
        String expectedText="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
        Thread.sleep(5000);
        //Assert.assertEquals(actualText, expectedText);
        String actualText1=driver.findElement(By.xpath("//div[@id=\"error\"]")).getText();
        String expectedText1="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
        String actualText2=driver.findElement(By.xpath("//div[@id=\"error\"]")).getText();
        String expectedText2="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";

        //Soft Assert
        SoftAssert sassert = new SoftAssert();
        sassert.assertEquals(actualText, expectedText);
        sassert.assertEquals(actualText1, expectedText1);
        sassert.assertEquals(actualText2, expectedText2);
        sassert.assertEquals(200, 201, "Status codes are not matching..");
        //sassert.assertEquals(actualText, expectedText);
        //System.out.println("My Application is working correctly......");
        //System.out.println("My Application is working correctly......");
        System.out.println("My Application is working correctly......");
        sassert.assertAll();
    }
}
