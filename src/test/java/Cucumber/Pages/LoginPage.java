package Cucumber.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driverObject;
    private By txt_username = By.id("name");
    private By txt_password = By.id("password");
    private By btn_login = By.id("login");
    private By btn_logout = By.id("logout");

    public LoginPage(WebDriver driverObject)
    {
        this.driverObject=driverObject;
        if(!driverObject.getTitle().equals("TestProject Demo")){
            throw new IllegalStateException("This is not expected Page "+driverObject.getCurrentUrl());
        }
    }

    public void enterUserName(String uName)
    {
        driverObject.findElement(txt_username).sendKeys(uName);
    }

    public void enterPassword(String password)
    {
        driverObject.findElement(txt_password).sendKeys(password);
    }

    public void LoginClick()
    {
        driverObject.findElement(btn_login).click();
    }
    public void CheckLogOutisDisplayed()
    {
        driverObject.findElement(btn_logout).click();
    }
}
