package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import base.BaseTest;

public class DataProviderTest extends BaseTest {

    @DataProvider(name = "data", parallel = true)
    public Object[][] data() {
        return new Object[][]{{"A"}, {"B"}, {"C"}};
    }

    @Test(dataProvider = "data")
    public void parallelTest(String value) {
        getDriver().get("https://www.google.com");
        Assert.assertTrue(true);
    }
}