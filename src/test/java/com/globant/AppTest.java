package com.globant;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.AssertJUnit;
//1. Setup-Open browser and application
//2. Login
//3. Logout
//4. deactivate user

public class AppTest{
    public String baseUrl="https://www.espn.com/?src=com&adblock=true";

    @BeforeSuite
    //1.Create ESPN valid account
    public void BeforeSuite(){
        System.out.println("Having an ESPN valid account ");
    }

    @BeforeClass
    //1. Open browser
    public void OpenBrowser() {

    }
    @BeforeMethod
    public void Browser () {
        System.out.println("Launching browser");
       /* System.setProperty("webdriver.chrome.driver","C:/Users/Marcela/DevProjects/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        */
    }
    @Test(priority = 1)
    //2. Login
    public void Login(){
        System.out.println("This is the Login");
           /* driver.get("http://parabank.parasoft.com");
            driver.findElement(By.name("username")).sendKeys("john");
            driver.findElement(By.name("password")).sendKeys("demo");
            driver.findElement(By.xpath("//input[@value='Log In']")).click();
            Assert.assertEquals("ParaBank | Accounts Overview", driver.getTitle());
            driver.findElement(By.partialLinkText("Log Out")).click();
*/
    }
    @Test(priority = 2)
    public  void Logout(){
        System.out.println("This is the logout");
    }

    @Test(priority = 3)
    public  void Deactivation(){
        System.out.println("This is the user deactivation");
    }

    @AfterMethod
    public void AfterM(){
        System.out.println("Closing browser-This ends the session");
        //driver.quit();
    }
    @AfterTest
    public void endSession(){
        System.out.println("After Test");
        //driver.quit();
    }


    @AfterSuite
    public void AfterS() {
        System.out.println("After Suite");
    }




}


