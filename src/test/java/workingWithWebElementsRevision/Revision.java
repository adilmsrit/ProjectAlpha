package workingWithWebElementsRevision;

import Utilities.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Revision extends Base {

    @Test
    public void TestCase_1() {
        WebDriver driver = super.Base();
        driver.get("http://www.yahoo.com");

        //Adil has fixed a defect here.

    }

}
