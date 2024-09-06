package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static pages.Loginpage.*;

public class LoginPage {

    @Given("User navigates to the demoTools login page")
    public void user_navigates_to_the_demoTools_Login_page() throws InterruptedException {
        navigateconfig();
    }

    @When("User navigate to love page")
    public void user_navigate_to_love_page(){
        enterUsername("username");
        enterPassword("password");
    }

    @When("User click on Sign in")
    public void user_click_on_sign_in(){
        clickSignIn();
    }

}
