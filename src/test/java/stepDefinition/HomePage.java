package stepDefinition;

import io.cucumber.java.en.Then;

import static pages.HomePage.closeDriver;
import static pages.HomePage.getTextName;

public class HomePage {

    @Then("User displays name on home page")
    public void user_displays_name_on_home_page() throws InterruptedException {
        getTextName();
        closeDriver();
    }
}
