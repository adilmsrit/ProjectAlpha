package dataProvider;

import org.testng.annotations.DataProvider;

public class TestData {
    //Gives us the data
    @DataProvider(name = "inputs")
    public Object[][] getData() {
        return new Object[][]{
                {"bmw", "m3"},
                {"audi", "a6"},
                {"benz", "c300"}
        };
    }
}
