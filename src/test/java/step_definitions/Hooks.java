package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    public static WebDriver driver1;


    @Before
    public void openBrowser() {
        String appUrl = "https://demo.nopcommerce.com/";
        driver1 = new ChromeDriver();
        driver1.get(appUrl);
        driver1.manage().window().maximize();
    }

    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(5000); // Consider using WebDriverWait for better practice
        if (driver1 != null) {
            driver1.quit();
        }
    }
}
