package pages;

import StepDefiniation.Hooks;
import org.openqa.selenium.By;


public class P02_login {
    public void login_link() {
        Hooks.driver.element().click(By.xpath("//button[text()='Login']"));
    }

    public void get_email(String email) {
        Hooks.driver.element().type(By.id("email"), email);
    }

    public void get_password(String password) {
        Hooks.driver.element().type(By.id("password"), password);
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
        Hooks.driver.element().getText(By.xpath("//*[@id=\'root\']/div[3]/div[3]/div[3]/div/div[3]/div/div/div[1]/div/h1")).equals("Welcome to the V.Connct Dashboard");
    }

    public void login_failed() {
        Hooks.driver.element().getText(By.xpath("//*[@id=\'kc-content-wrapper\']/div[1]/span[2]")).equals("Invalid username or password.");
    }


}
