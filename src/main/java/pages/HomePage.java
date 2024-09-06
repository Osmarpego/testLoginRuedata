package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;


public class HomePage extends BrowserDriver {

    public static String txtName = "[class='logged-user-name']";

    public static void getTextName() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(txtName)).isDisplayed();
    }

    public static void closeDriver(){
        driver.quit();
    }
}
