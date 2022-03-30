package Cucumber.Steps;
import Cucumber.Pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {
    private WebDriver driver = null;
    private LoginPage LoginPageObject;

    @Given("^Browser is Open$")
    public void browser_is_Open() throws Throwable {
        System.out.println("1");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    }

    @Given("^User is on login page$")
    public void user_is_on_login_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("2");
        driver.get("https://example.testproject.io/web/");

    }

    @When("^user enters \"(.*?)\" and \"(.*?)\"$")
    public void user_enters_and(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("3");
        LoginPageObject = new LoginPage(driver);
        LoginPageObject.enterUserName(arg1);
        LoginPageObject.enterPassword(arg2);
        Thread.sleep(2000);
    }

    @When("^clicks on Login button$")
    public void clicks_on_Login_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("4");
        LoginPageObject.LoginClick();
    }

    @Then("^user is navigated to homepage$")
    public void user_is_navigated_to_homepage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("5");
        LoginPageObject.CheckLogOutisDisplayed();
    }
}
