package dataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProviders {

    @Test(dataProvider = "inputs", dataProviderClass = TestData.class)
    public void testMethod1(String str1, String str2) {
        System.out.println("Input 1:  " + str1);
        System.out.println("Input 2:  " + str2);
    }
}
