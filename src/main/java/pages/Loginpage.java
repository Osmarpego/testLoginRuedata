package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

public class Loginpage extends BrowserDriver {

    public static String txtBoxUsername = "username";
    public static String txtBoxPassword = "password";
    public static String btnSignIn = "log-in";

    public static void navigateconfig() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.applitools.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    public static void enterUsername(String username) {
        driver.findElement(By.id(txtBoxUsername)).sendKeys(username);
    }

    public static void enterPassword(String password) {
        driver.findElement(By.id(txtBoxPassword)).sendKeys(password);
    }

    public static void clickSignIn() {
        driver.findElement(By.id(btnSignIn)).click();
    }

}
