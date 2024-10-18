package utilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;

import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Collections;
import java.util.Date;

import static java.time.Duration.ofMillis;
import static java.util.Collections.singletonList;
import static utilities.Driver.getAppiumDriver;


public class ReusableMethods {
    private static DesiredCapabilities desiredCapabilities = new DesiredCapabilities();


    public static void apkYukle() {

        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigReader.getProperty("Pixel 8 Pro"));
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, ConfigReader.getProperty("12.0"));
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        //desiredCapabilities.setCapability(MobileCapabilityType.APP,ConfigReader.getProperty(apk));
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, ConfigReader.getProperty("com.wise.querycart"));
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ConfigReader.getProperty("com.wise.querycart.MainActivity"));
    }

    public static void elementClick(WebElement elementName) {
        var el1 = getAppiumDriver().findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"" + elementName + "\").instance(0)"));
        el1.click();
    }

    public static void koordinatTiklama(int xKoordinat, int yKoordinat, int bekleme, WebElement slider) throws InterruptedException {
        Point source = slider.getLocation();
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence sequence = new Sequence(finger, 1);
        sequence.addAction(finger.createPointerMove(ofMillis(0),
                PointerInput.Origin.viewport(), source.x, source.y));
        sequence.addAction(finger.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()));
        sequence.addAction(new Pause(finger, ofMillis(600)));
        sequence.addAction(finger.createPointerMove(ofMillis(600),
                PointerInput.Origin.viewport(), source.x + 400, source.y));
        sequence.addAction(finger.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()));

        getAppiumDriver().perform(singletonList(sequence));
    }

    //  static AndroidDriver<AndroidElement> driver=Driver.getAppiumDriver();
    public static void koordinatTiklamaMethodu(int x, int y) throws InterruptedException {
        TouchAction action = new TouchAction((PerformsTouchActions) getAppiumDriver());
        action.press(PointOption.point(x, y)).release().perform();
        Thread.sleep(1000);
    }

    public static void scrollWithUiScrollableAndClick(String elementText) {
        AndroidDriver driver = (AndroidDriver) getAppiumDriver();
        //  driver.findElement(AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + elementText + "\"))");
        driver.findElement(By.xpath("//*[@text='" + elementText + "']")).click();

    }

    public static void scrollWithUiScrollable(String elementText) {
        AndroidDriver driver = (AndroidDriver) getAppiumDriver();
        //   driver.findElement(AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + elementText + "\"))"));

    }

    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) getAppiumDriver();

        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/target/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }

    public static void ekranKaydirmaMethodu(int xPress, int yPress, int wait, int xMove, int yMove) {
        TouchAction action = new TouchAction<>((PerformsTouchActions) getAppiumDriver());
        action.press(PointOption.point(xPress, yPress))
                .waitAction(WaitOptions.waitOptions(ofMillis(wait)))
                .moveTo(PointOption.point(xMove, yMove))
                .release()
                .perform();
    }

    public static void wait(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void scrollWithUiScrollableContentDesc(String elementText) {

        getAppiumDriver().findElement(
                MobileBy.AndroidUIAutomator(
                        "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().description(\"" + elementText + "\"));"
                )
        );
    }

    public static void waitForElementAndClick(WebElement element) {
        WebDriverWait wait = new WebDriverWait(getAppiumDriver(), Duration.ofSeconds(20));

        // Element görünür olana kadar bekler ve ardından tıklar
        WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(element));
        clickableElement.click();
    }


    public static void waitForElementAndSendkey(WebElement element,String key) {
        WebDriverWait wait = new WebDriverWait(getAppiumDriver(), Duration.ofSeconds(20));

        // Element görünür olana kadar bekler ve ardından tıklar
        WebElement enableElement = wait.until(ExpectedConditions.elementToBeClickable(element));
        enableElement.sendKeys(key);
    }

    public static void waitForElementIsDisplayed(WebElement element) {
        WebDriverWait wait = new WebDriverWait(getAppiumDriver(), Duration.ofSeconds(20));

        // Element görünür olana kadar bekler ve ardından tıklar
        WebElement enableElement = wait.until(ExpectedConditions.elementToBeClickable(element));
        enableElement.isDisplayed();
    }

    public static void clickAtCoordinatesW3C(int x, int y) {
        AppiumDriver driver = getAppiumDriver();

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1)
                .addAction(finger.createPointerMove(ofMillis(0), PointerInput.Origin.viewport(), x, y))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(singletonList(tap));
    }



}
