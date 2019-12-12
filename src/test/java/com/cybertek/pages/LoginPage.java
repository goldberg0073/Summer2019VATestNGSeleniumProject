package com.cybertek.pages;

import com.cybertek.tests.practice.TestBase;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    public LoginPage(){

        PageFactory.initElements(Driver.get(), this);
    }

    //  @FindBys({@FindBy(id="prependedInput"),@FindBy(name="prependedInput")})
    // find element using multiple locators
    // @FindAll====> find element that matches all the locators provided


    @FindBy(id="prependedInput")
    public WebElement userName;

    @FindBy(id="prependedInput2")
    public WebElement password;

    @FindBy(name = "_submit")
    public WebElement submit;

    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
    }

}
