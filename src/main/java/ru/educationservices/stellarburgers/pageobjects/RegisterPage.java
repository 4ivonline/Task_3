package ru.educationservices.stellarburgers.pageobjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static ru.educationservices.stellarburgers.elements.RegisterPageElements.*;

import java.time.Duration;

public class RegisterPage {

    private WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }
    @Step("Загрузка страницы <Регистрация>")
    public void waitForLoadRegisterHeader() {
        new WebDriverWait(driver, Duration.ofSeconds(7))
                .until(ExpectedConditions.visibilityOfElementLocated(REGISTRATION_HEADER));
    }

    @Step("Заполнение поля <Имя>")
    public String fillRegisterInputName(String name) {
        driver.findElement(INPUT_NAME).sendKeys(name);
        return name;
    }

    @Step("Заполнение поля <Email>")
    public String fillRegisterEmail(String email) {
        driver.findElement(INPUT_EMAIL).sendKeys(email);
        return email;
    }

    @Step("Заполнение поля <Пароль>")
    public String fillRegisterPassword(String password) {
        driver.findElement(INPUT_PASSWORD).sendKeys(password);
        return password;
    }

    @Step("Кликаем на кнопку <Зарегистрироваться>")
    public void clickButtonRegistration() {
        driver.findElement(BUTTON_REGISTRATION).click();
    }

    @Step("Проверяем текст ошибки поля <Пароль>")
    public String checkErrorTextPassword() {
        return driver.findElement(ERROR_TEXT_PASSWORD).getText();
    }

    @Step("Кликаем на кнопку <Войти>")
    public void clickButtonSignInByRegistration() {
        driver.findElement(TEXT_BUTTON_ENTER).click();
    }
}