package listeners;

import org.testng.*;
import com.aventstack.extentreports.*;
import base.BaseTest;
import utils.*;

public class ExtentTestNGListener implements ITestListener {
    ExtentReports extent = ExtentManager.getReport();
    ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    public void onTestStart(ITestResult result) {
        test.set(extent.createTest(result.getMethod().getMethodName()));
    }

    public void onTestFailure(ITestResult result) {
        BaseTest base = (BaseTest) result.getInstance();
        String path = ScreenshotUtil.capture(base.getDriver(),
                result.getMethod().getMethodName());
        test.get().fail(result.getThrowable());
        test.get().addScreenCaptureFromPath(path);
    }

    public void onFinish(ITestContext context) {
        extent.flush();
    }
}