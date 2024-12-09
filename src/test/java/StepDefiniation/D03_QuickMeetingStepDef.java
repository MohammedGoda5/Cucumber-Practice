package StepDefiniation;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P02_login;
import pages.P03_QuickMeeting;


public class D03_QuickMeetingStepDef {
    P02_login log = new P02_login();
    P03_QuickMeeting createMeeting = new P03_QuickMeeting();

    @When("user goes to login page")
    public void loginToVconnct() {
        log.login_link();

    }
    @And("user login using valid credentials")
    public void loginTOVconnct(){
        log.get_email("odinabil972@gmail.com");
        log.get_password("123456Mm");
        log.click_login();
    }
    @Given("user add valid meeting name")
    public void addMeetingName() {
        createMeeting.meetingField("meet");
    }

    @And("user choose to create meet")
    public void chooseEngine() {

        createMeeting.meetingButton();

    }

    @And("user run the created meeting")
    public void runMeeting() {
        createMeeting.runMeetingButton();

    }

    @And("user user accept terms and condition")
    public void acceptTerms_Condition() {
        createMeeting.acceptTerms_Condition();

    }

    @Then("user start the created meeting")
    public void startMeeting() {
        createMeeting.startCreatedMeeting();
    }
}


