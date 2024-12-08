package StepDefiniation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P02_login;



public class D02_loginStepDef {
    P02_login log=new P02_login();

    @When("user go to login page")
    public void login_page(){

        log.login_link();
    }

    @Given("user login with valid Email")
    public void email(){
    log.get_email();

    }
    @And("user login with valid password")
    public void password(){
        log.get_password();

    }
    @And("user press on login button")
    public void login_button(){
        log.RememberMe();

        log.click_login();

    }
//    @And("user open my account")
//    public void account() throws InterruptedException {
//        log.my_account().click();
//        Thread.sleep(400);
//    }

    @Then("user login to the system successfully")
    public void login_successfully(){
        log.login_success();
    }


    //Negative scenario

//    @Given("user login with invalid Email")
//    public void invalid_email(){
//        log.get_email().sendKeys("wrong@example.com");
//    }
//
//    @And("login with invalid password")
//    public void invalid_password() throws InterruptedException {
//        log.get_password().sendKeys("P@ssw0rd");
//        Thread.sleep(500);
//    }
//
//    @Then("user could not login to the system")
//    public void login_failed(){
//        SoftAssert soft=new SoftAssert();
//        soft.assertTrue(log.login_failed().getText().contains("Login was unsuccessful."));
//        String actual=log.login_failed().getCssValue("color");
//        actual= Color.fromString(actual).asHex();
//        String expect="#e4434b";
//        soft.assertEquals(actual,expect);
//        soft.assertAll();
//    }
//
//
}
