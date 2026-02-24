package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import utils.RetryAnalyzer;

public class Test1  extends BaseTest{
	
	@Test
    public void test1() {
        getDriver().get("https://www.google.com");
        Assert.assertEquals(getDriver().getTitle(), "Google");
    }

}
