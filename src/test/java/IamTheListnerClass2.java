import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class IamTheListnerClass2 implements WebDriverEventListener {

    @Override
    public void beforeAlertAccept(WebDriver webDriver) {
        System.out.println("IamTheListnerClass2 Adil Implemented the interface method for demo purpose for : beforeAlertAccept");
    }

    @Override
    public void afterAlertAccept(WebDriver webDriver) {
        System.out.println("IamTheListnerClass2 Adil Implemented the interface method for demo purpose for : afterAlertAccept");
    }

    @Override
    public void afterAlertDismiss(WebDriver webDriver) {
        System.out.println("IamTheListnerClass2 Adil Implemented the interface method for demo purpose for : afterAlertDismiss");
    }

    @Override
    public void beforeAlertDismiss(WebDriver webDriver) {
        System.out.println("IamTheListnerClass2 Adil Implemented the interface method for demo purpose for : beforeAlertDismiss");
    }

    @Override
    public void beforeNavigateTo(String s, WebDriver webDriver) {
        System.out.println("IamTheListnerClass2 Adil Implemented the interface method for demo purpose for : beforeNavigateTo");
    }

    @Override
    public void afterNavigateTo(String s, WebDriver webDriver) {
        System.out.println("IamTheListnerClass2 Adil Implemented the interface method for demo purpose for : afterNavigateTo");
    }

    @Override
    public void beforeNavigateBack(WebDriver webDriver) {
        System.out.println("IamTheListnerClass2 Adil Implemented the interface method for demo purpose for : beforeNavigateBack");
    }

    @Override
    public void afterNavigateBack(WebDriver webDriver) {
        System.out.println("IamTheListnerClass2 Adil Implemented the interface method for demo purpose for : afterNavigateBack");
    }

    @Override
    public void beforeNavigateForward(WebDriver webDriver) {
        System.out.println("IamTheListnerClass2 Adil Implemented the interface method for demo purpose for : beforeNavigateForward");
    }

    @Override
    public void afterNavigateForward(WebDriver webDriver) {
        System.out.println("IamTheListnerClass2 Adil Implemented the interface method for demo purpose for : afterNavigateForward");
    }

    @Override
    public void beforeNavigateRefresh(WebDriver webDriver) {
        System.out.println("IamTheListnerClass2 Adil Implemented the interface method for demo purpose for : beforeNavigateRefresh");
    }

    @Override
    public void afterNavigateRefresh(WebDriver webDriver) {
        System.out.println("IamTheListnerClass2 Adil Implemented the interface method for demo purpose for : afterNavigateRefresh");
    }

    @Override
    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {
        System.out.println("IamTheListnerClass2 Adil Implemented the interface method for demo purpose for : beforeFindBy");
    }

    @Override
    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {
        System.out.println("IamTheListnerClass2 Adil Implemented the interface method for demo purpose for : afterFindBy");
    }

    @Override
    public void beforeClickOn(WebElement webElement, WebDriver webDriver) {
        System.out.println("IamTheListnerClass2 Adil Implemented the interface method for demo purpose for : beforeClickOn");
    }

    @Override
    public void afterClickOn(WebElement webElement, WebDriver webDriver) {
        System.out.println("IamTheListnerClass2 Adil Implemented the interface method for demo purpose for : afterClickOn");
    }

    @Override
    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        System.out.println("IamTheListnerClass2 Adil Implemented the interface method for demo purpose for : beforeChangeValueOf");
    }

    @Override
    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        System.out.println("IamTheListnerClass2 Adil Implemented the interface method for demo purpose for : afterChangeValueOf");
    }

    @Override
    public void beforeScript(String s, WebDriver webDriver) {
        System.out.println("IamTheListnerClass2 Adil Implemented the interface method for demo purpose for : beforeScript");
    }

    @Override
    public void afterScript(String s, WebDriver webDriver) {
        System.out.println("IamTheListnerClass2 Adil Implemented the interface method for demo purpose for : afterScript");
    }

    @Override
    public void beforeSwitchToWindow(String s, WebDriver webDriver) {
        System.out.println("IamTheListnerClass2 Adil Implemented the interface method for demo purpose for : beforeSwitchToWindow");
    }

    @Override
    public void afterSwitchToWindow(String s, WebDriver webDriver) {
        System.out.println("IamTheListnerClass2 Adil Implemented the interface method for demo purpose for : afterSwitchToWindow");
    }

    @Override
    public void onException(Throwable throwable, WebDriver webDriver) {
        System.out.println("IamTheListnerClass2 Adil Implemented the interface method for demo purpose for : onException");
    }

    @Override
    public <X> void beforeGetScreenshotAs(OutputType<X> outputType) {
        System.out.println("IamTheListnerClass2 Adil Implemented the interface method for demo purpose for : beforeGetScreenshotAs");
    }

    @Override
    public <X> void afterGetScreenshotAs(OutputType<X> outputType, X x) {
        System.out.println("IamTheListnerClass2 Adil Implemented the interface method for demo purpose for : afterGetScreenshotAs");
    }

    @Override
    public void beforeGetText(WebElement webElement, WebDriver webDriver) {
        System.out.println("IamTheListnerClass2 Adil Implemented the interface method for demo purpose for : beforeGetText");
    }

    @Override
    public void afterGetText(WebElement webElement, WebDriver webDriver, String s) {
        System.out.println("IamTheListnerClass2 Adil Implemented the interface method for demo purpose for : afterGetText");
    }
}
