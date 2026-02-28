package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import base.BaseTest;
import listeners.ExtentTestNGListener;
import utils.RetryAnalyzer;

@Listeners(ExtentTestNGListener.class)
public class GoogleTest extends BaseTest {

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void openGoogle() {
        getDriver().get("https://www.google.com");
        Assert.assertEquals(getDriver().getTitle(), "Google");
    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void failTest() {
        Assert.assertTrue(false);
    }
    
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void openBing() {
        getDriver().get("https://www.bing.com");
        Assert.assertEquals(getDriver().getTitle(), "bing");
    }
}