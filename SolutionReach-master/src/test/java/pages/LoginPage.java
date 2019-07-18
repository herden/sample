package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {


    private static By usernameID = By.id("okta-signin-username");
    private static By passwordID =  By.id("okta-signin-password");
    private static By submitID = By.id("okta-signin-submit");
    private static By errorCSS = By.xpath("//div[contains (@class, 'infobox-error')]/p");

    private static WebElement username (WebDriver driver) {

           WebElement element = driver.findElement(usernameID);

           return element;

    }

    private static WebElement password (WebDriver driver) {

        WebElement element = driver.findElement(passwordID);
        return element;

    }

    private static WebElement signIn (WebDriver driver) {

        WebElement element = driver.findElement(submitID);
        return element;

    }

    private static  WebElement signinError (WebDriver driver)  {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorCSS));
        WebElement element = driver.findElement(errorCSS);

        return element;
    }

    public static void  signInWith (WebDriver driver, String username, String password) {
        username(driver).sendKeys(username);
        password(driver).sendKeys(password);

        signIn(driver).sendKeys(Keys.RETURN);

    }

    public static void open (WebDriver driver) {

        driver.get("https://smilereminder.com/sr/login.jsp");
    }

    public static boolean hasError (WebDriver driver) {
        boolean isDisplayed = LoginPage.signinError(driver).isDisplayed();

        return isDisplayed;
    }

}
