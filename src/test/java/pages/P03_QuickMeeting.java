package pages;

import StepDefiniation.Hooks;
import org.openqa.selenium.By;

public class P03_QuickMeeting {
    public void meetingField(String meetingName) {
         Hooks.driver.element().type(By.id("meetingName"), meetingName);
    }

    public void meetingButton() {
        Hooks.driver.element().click(By.xpath("//*[@id=\'rc-tabs-0-panel-1\']/div/div[2]/div[2]/button"));
    }

    public void runMeetingButton() {
        Hooks.driver.element().click(By.xpath("//button[text()='Run Meeting']"));
    }

    public void acceptTerms_Condition() {
        Hooks.driver.element().click(By.xpath("//*[@id=\'root\']/div[2]/div/div[2]/div/button[2]"));
    }

    public void startCreatedMeeting(){
        Hooks.driver.element().switchToIframe(By.xpath("//*[@id=\'jitsiConferenceFrame0\']"));
        Hooks.driver.element().click(By.xpath("//*[@id='videoconference_page']/div[4]/div[1]/div/div/div[1]/div[2]/div/div"));
    }

    //assertion



}
