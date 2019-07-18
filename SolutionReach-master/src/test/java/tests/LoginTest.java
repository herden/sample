package tests;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.LoginPage;


public class LoginTest {

    public static void main (String [] args) {

        String projectPath = System.getProperty( "user.dir" );
        System.setProperty("webdriver.gecko.driver", projectPath+"//drivers/geckodriver/geckodriver");

        WebDriver driver = new FirefoxDriver();

        LoginPage.open(driver);

        LoginPage.signInWith(driver,"MyUserName", "MyPassword");
        Assert.assertTrue (LoginPage.hasError(driver));

        driver.quit();

    }




}
