package pages;

import StepDefiniation.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {
    public void login_link() {
         Hooks.driver.element().click(By.xpath("//button[text()='Login']"));
    }

    public void get_email() {
        Hooks.driver.element().type(By.id("email"),"odinabil972@gmail.com");
    }

    public void get_password() {
        Hooks.driver.element().type(By.id("password"),"123456Mm");
    }

    public void RememberMe() {
        Hooks.driver.element().click(By.id("rememberMe"));
    }

    public void click_login() {
       Hooks.driver.element().click(By.id("kc-login"));
    }

    public void my_account() {
        Hooks.driver.element().getText(By.cssSelector("div.master-wrapper-page:nth-child(7) div.header div.header-upper div.header-links-wrapper div.header-links ul:nth-child(1) li:nth-child(1) > a.ico-account"));
    }

    //assertion
    public void login_success() {
        Hooks.driver.element().getText(By.xpath("<h1 class=\'vlcbannerh1 edit-size-header mt-2\'>Welcome to the V.Connct Dashboard</h1>"));
    }

    public void login_failed() {
        Hooks.driver.element().getText(By.cssSelector("div.master-wrapper-page:nth-child(7) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.login-page div.page-body div.customer-blocks div.returning-wrapper.fieldset form:nth-child(1) > div.message-error.validation-summary-errors:nth-child(1)"));
    }


}
