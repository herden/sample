import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {


    public static void main (String [] args) {

        String projectPath = System.getProperty( "user.dir" );
        System.out.println("Project path : " + projectPath);

        System.setProperty("webdriver.gecko.driver", projectPath+"//drivers/geckodriver/geckodriver");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://smilereminder.com/sr/login.jsp");


    }

}
