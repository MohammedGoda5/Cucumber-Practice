package StepDefiniation;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P02_login;


public class D02_loginStepDef {
    P02_login log = new P02_login();

    @When("user go to login page")
    public void login_page() {

        log.login_link();
    }

    @Given("user login with valid Email")
    public void email() {

        log.get_email("odinabil972@gmail.com");

    }

    @And("user login with valid password")
    public void password() {
        log.get_password("123456Mm");

    }

    @And("user press on login button")
    public void login_button() {
        log.RememberMe();

        log.click_login();

    }

    @Then("user login to the system successfully")
    public void login_successfully() {
        log.login_success();
    }


    @Given("user login with invalid Email")
    public void invalid_email() {
        log.get_email("wrong@example.com");
    }

    @And("login with invalid password")
    public void invalid_password() {
        log.get_password("123456");

    }

    @Then("user could not login to the system")
    public void login_failed() {
        log.login_failed();
    }


}
