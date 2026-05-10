package ru.educationservices.stellarburgers.pageobjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static ru.educationservices.stellarburgers.elements.SignInPageElements.*;

import java.time.Duration;

public class SignInPage {

    private WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Загрузка страницы <Вход>")
    public void waitForLoadSignInHeader() {
        new WebDriverWait(driver, Duration.ofSeconds(7))
                .until(ExpectedConditions.visibilityOfElementLocated(HEADER_LOGIN));
    }

    @Step("Проверяем заголовок <Вход>")
    public String checkHeaderSignIn() {
        return driver.findElement(HEADER_LOGIN).getText();
    }

    @Step("Заполняем поле <Email>")
    public String fillSignInEmail(String email) {
        driver.findElement(LOGIN_EMAIL).sendKeys(email);
        return email;
    }

    @Step("Заполняем поле <Пароль>")
    public String fillSignInPassword(String password) {
        driver.findElement(LOGIN_PASSWORD).sendKeys(password);
        return password;
    }

    @Step("Кликаем на кнопку <Войти>")
    public void clickButtonSignIn() {
        driver.findElement(LOGIN_BUTTON_SIGNIN).click();
    }

    @Step("Кликаем на кнопку <Зарегистрироваться>")
    public void clickButtonRegistration() {
        driver.findElement(LOGIN_BUTTON_REGISTRATION).click();
    }

    @Step("Кликаем на кнопку <Восстановить пароль>")
    public void clickButtonResetPassword() {
        driver.findElement(LOGIN_BUTTON_RESET_PASSWORD).click();
    }
}