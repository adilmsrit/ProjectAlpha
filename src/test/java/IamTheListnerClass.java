import org.openqa.selenium.*;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class IamTheListnerClass implements WebDriverEventListener {

    @Override
    public void beforeAlertAccept(WebDriver webDriver) {
        System.out.println("Adil Implemented the interface method for demo purpose for : beforeAlertAccept");
    }

    @Override
    public void afterAlertAccept(WebDriver webDriver) {
        System.out.println("Adil Implemented the interface method for demo purpose for : afterAlertAccept");
    }

    @Override
    public void afterAlertDismiss(WebDriver webDriver) {
        System.out.println("Adil Implemented the interface method for demo purpose for : afterAlertDismiss");
    }

    @Override
    public void beforeAlertDismiss(WebDriver webDriver) {
        System.out.println("Adil Implemented the interface method for demo purpose for : beforeAlertDismiss");
    }

    @Override
    public void beforeNavigateTo(String s, WebDriver webDriver) {
        System.out.println("Adil Implemented the interface method for demo purpose for : beforeNavigateTo");
    }

    @Override
    public void afterNavigateTo(String s, WebDriver webDriver) {
        System.out.println("Adil Implemented the interface method for demo purpose for : afterNavigateTo");

//        try {
//            JavascriptExecutor jsExecutor = (JavascriptExecutor) webDriver;
//            URL url = new URL("https://raw.githubusercontent.com/GoogleChrome/" +
//                    "accessibility-developer-tools/stable/dist/js/axs_testing.js");
//            String script = IOUtils.toString(url.openStream(), StandardCharsets.UTF_8);
//            jsExecutor.executeScript(script);
//            String report = (String) jsExecutor.executeScript("var results = axs.Audit.run();" +
//                    "return axs.Audit.createReport(results);");
//            System.out.println("### Accessibility Report for " +  webDriver.getTitle() + "####");
//            System.out.println(report);
//            System.out.println("### END ####");
//        }
//        catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            JavascriptExecutor jsExecutor = (JavascriptExecutor) webDriver;
            // Get the Load Event End
            long loadEventEnd = (Long) jsExecutor.executeScript("return window.performance.timing.loadEventEnd;");
            // Get the Navigation Event Start
            long navigationStart = (Long) jsExecutor.executeScript("return window.performance.timing.navigationStart;");
            // Difference between Load Event End and Navigation Event Start is // Page Load Time
            System.out.println("Page Load Time is " + (loadEventEnd - navigationStart)/1000 + " seconds.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void beforeNavigateBack(WebDriver webDriver) {
        System.out.println("Adil Implemented the interface method for demo purpose for : beforeNavigateBack");
    }

    @Override
    public void afterNavigateBack(WebDriver webDriver) {
        System.out.println("Adil Implemented the interface method for demo purpose for : afterNavigateBack");
    }

    @Override
    public void beforeNavigateForward(WebDriver webDriver) {
        System.out.println("Adil Implemented the interface method for demo purpose for : beforeNavigateForward");
    }

    @Override
    public void afterNavigateForward(WebDriver webDriver) {
        System.out.println("Adil Implemented the interface method for demo purpose for : afterNavigateForward");
    }

    @Override
    public void beforeNavigateRefresh(WebDriver webDriver) {
        System.out.println("Adil Implemented the interface method for demo purpose for : beforeNavigateRefresh");
    }

    @Override
    public void afterNavigateRefresh(WebDriver webDriver) {
        System.out.println("Adil Implemented the interface method for demo purpose for : afterNavigateRefresh");


    }

    @Override
    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {
        System.out.println("Adil Implemented the interface method for demo purpose for : beforeFindBy");
    }

    @Override
    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {
        System.out.println("Adil Implemented the interface method for demo purpose for : afterFindBy");
    }

    @Override
    public void beforeClickOn(WebElement webElement, WebDriver webDriver) {
        System.out.println("Adil Implemented the interface method for demo purpose for : beforeClickOn");
    }

    @Override
    public void afterClickOn(WebElement webElement, WebDriver webDriver) {
        System.out.println("Adil Implemented the interface method for demo purpose for : afterClickOn");
    }

    @Override
    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        System.out.println("Adil Implemented the interface method for demo purpose for : beforeChangeValueOf");
    }

    @Override
    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        System.out.println("Adil Implemented the interface method for demo purpose for : afterChangeValueOf");
    }

    @Override
    public void beforeScript(String s, WebDriver webDriver) {
        System.out.println("Adil Implemented the interface method for demo purpose for : beforeScript");
    }

    @Override
    public void afterScript(String s, WebDriver webDriver) {
        System.out.println("Adil Implemented the interface method for demo purpose for : afterScript");
    }

    @Override
    public void beforeSwitchToWindow(String s, WebDriver webDriver) {
        System.out.println("Adil Implemented the interface method for demo purpose for : beforeSwitchToWindow");
    }

    @Override
    public void afterSwitchToWindow(String s, WebDriver webDriver) {
        System.out.println("Adil Implemented the interface method for demo purpose for : afterSwitchToWindow");
    }

    @Override
    public void onException(Throwable throwable, WebDriver webDriver) {
        System.out.println("Adil Implemented the interface method for demo purpose for : onException");
    }

    @Override
    public <X> void beforeGetScreenshotAs(OutputType<X> outputType) {
        System.out.println("Adil Implemented the interface method for demo purpose for : beforeGetScreenshotAs");
    }

    @Override
    public <X> void afterGetScreenshotAs(OutputType<X> outputType, X x) {
        System.out.println("Adil Implemented the interface method for demo purpose for : afterGetScreenshotAs");
    }

    @Override
    public void beforeGetText(WebElement webElement, WebDriver webDriver) {
        System.out.println("Adil Implemented the interface method for demo purpose for : beforeGetText");
    }

    @Override
    public void afterGetText(WebElement webElement, WebDriver webDriver, String s) {
        System.out.println("Adil Implemented the interface method for demo purpose for : afterGetText");
    }
}
