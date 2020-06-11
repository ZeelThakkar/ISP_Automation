package co.pragra.ISP_framework.utils;

import co.pragra.ISP_framework.base.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class FrameworkUtils extends TestBase {

public static void captureScreenshot() {

    File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    try {
        FileUtils.copyFile(src, new File(prop.getProperty("ScreenshotFile.location") + System.currentTimeMillis() + ".png"));
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
}





}
