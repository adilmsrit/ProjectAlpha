package eventFiringWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NavigationTest {

    WebDriver driver;
    EventFiringWebDriver eventFiringDriver;
    IamTheListnerClass eventListener;
    IamTheListnerClass2 eventListener2;

    @BeforeMethod
    public void beforeMethod() {        // set path of Chromedriver executable
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
        // initialize new WebDriver session
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        eventFiringDriver = new EventFiringWebDriver(driver);
        eventListener = new IamTheListnerClass();
        eventListener2 = new IamTheListnerClass2();
        eventFiringDriver.register(eventListener);
        eventFiringDriver.register(eventListener2);

    }

    @Test
    public void navigateToAUrl() {

        eventFiringDriver.get("http://demo-store.seleniumacademy.com/");
        WebElement searchBox = eventFiringDriver.findElement(By.name("q"));
        searchBox.sendKeys("Phones");
        WebElement searchButton = eventFiringDriver.findElement(By.className("search-button"));
        searchButton.click();
        // Validate page title
        Assert.assertEquals(eventFiringDriver.getTitle(), "Search results for: 'Phones'");
    }

    @AfterMethod
    public void afterMethod() {
        // close and quit the browser
        eventFiringDriver.quit();
    }

}
