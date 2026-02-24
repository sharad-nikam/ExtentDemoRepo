package utils;

import java.io.File;
import org.openqa.selenium.*;

public class ScreenshotUtil {
    public static String capture(WebDriver driver, String name) {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("test-output/screenshots/" + name + ".png");
        dest.getParentFile().mkdirs();
        src.renameTo(dest);
        return dest.getPath();
    }
}