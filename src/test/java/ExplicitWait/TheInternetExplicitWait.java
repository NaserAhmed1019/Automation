package ExplicitWait;

import Pages.TheInternetExplicitWaitPage;
import Utils.DriverUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class TheInternetExplicitWait {
WebDriver driver;
TheInternetExplicitWaitPage homepage;
@BeforeClass
    void setUp() {
    driver= DriverUtil.getWebDriver();
    homepage = new TheInternetExplicitWaitPage();
    driver.get(homepage.pageUrl);

}
@Test
    void TheInternet() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    driver.findElement(homepage.example2Locator).click();
    driver.findElement(homepage.startLocator).click();

    wait.until(ExpectedConditions.visibilityOfElementLocated(homepage.finishLocator));
    String el = driver.findElement(homepage.finishLocator).getText();

    Assert.assertEquals(el, "Hello World!");
}
@AfterClass
    void wrapUp() {
    driver.quit();
}
}
