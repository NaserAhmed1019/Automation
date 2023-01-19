package Pages;

import org.openqa.selenium.By;

public class TheInternetExplicitWaitPage {


    public String pageUrl = "https://the-internet.herokuapp.com/dynamic_loading";

    public String page2Url = "https://the-internet.herokuapp.com/dynamic_loading/2";

    public By example2Locator = new By.ByCssSelector(".example a:last-child");

    public By startLocator = new By.ByCssSelector("#start button");

    public By finishLocator = new By.ByCssSelector(".example #finish");
}
