package ru.educationservices.stellarburgers.pageobjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static ru.educationservices.stellarburgers.elements.PasswordRecoveryElements.*;

public class PasswordRecoveryPage {

    private WebDriver driver;

    public PasswordRecoveryPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Загрузка страницы <Восстановление пароля>")
    public void waitForLoadPasswordRecoveryHeader() {
        new WebDriverWait(driver, Duration.ofSeconds(7))
                .until(ExpectedConditions.visibilityOfElementLocated(PASSWORD_RECOVEY_HEADER));
    }

    @Step("Проверяем заголовок <Восстановление пароля>")
    public String checkHeaderPasswordRecovery() {
        return driver.findElement(PASSWORD_RECOVEY_HEADER).getText();
    }

    @Step("Кликаем на кнопку <Войти>")
    public void clickButtonSignInByPasswordRecovery() {
        driver.findElement(PASSWORD_RECOVEY_SIGNIN).click();
    }
}