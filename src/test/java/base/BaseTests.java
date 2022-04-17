package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

public class BaseTests {
    protected HomePage homePage;
    WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    @After
    public void driverQuit(){
        driver.quit();
    }
}
