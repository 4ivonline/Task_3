package ru.educationservices.stellarburgers;

import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;
import ru.educationservices.stellarburgers.factory.BrowserFactory;
import ru.educationservices.stellarburgers.navigation.Navigation;
import ru.educationservices.stellarburgers.pageobjects.*;

public class BaseTest {

    protected WebDriver driver;
    protected String browser;
    protected Navigation navigation;
    public static final String BASE_URL = "https://qa-stellarburgers.education-services.ru";

    protected MainPage mainPage;
    protected SignInPage signInPage;
    protected RegisterPage registerPage;
    protected PasswordRecoveryPage passwordRecoveryPage;
    protected MyAccountPage myAccountPage;
    protected ConstructorPage constructorPage;

    protected void initPageObject() {

        mainPage = new MainPage(driver);
        signInPage = new SignInPage(driver);
        registerPage = new RegisterPage(driver);
        passwordRecoveryPage = new PasswordRecoveryPage(driver);
        myAccountPage = new MyAccountPage(driver);
        constructorPage = new ConstructorPage(driver);
    }

    protected void changeBrowser(String browserName) {
        if (driver != null) {
            driver.quit();
        }
        browser = browserName;
        driver = BrowserFactory.getDriver(browser);
        driver.get(BASE_URL);

        navigation = new Navigation(driver);
    }

    @AfterEach
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
    }