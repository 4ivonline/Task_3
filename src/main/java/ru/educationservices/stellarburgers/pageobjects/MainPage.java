package ru.educationservices.stellarburgers.pageobjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static ru.educationservices.stellarburgers.elements.MainPageElements.*;

import java.time.Duration;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Ожидание загрузки главной страницы")
    public void waitForLoadMainPage() {
        new WebDriverWait(driver, Duration.ofSeconds(7))
                .until(ExpectedConditions.visibilityOfElementLocated(MAIN_PAGE_HEADER_TEXT));
    }

    @Step("Кликаем на кнопку <Войти в аккаунт>")
    public void clickMainButtonSignIn() {
        driver.findElement(BUTTON_SIGN_IN).click();
    }

    @Step("Кликаем на кнопку <Личный кабинет>")
    public void clickButtonMyAccount() {
        driver.findElement(BUTTON_MY_ACCOUNT).click();
    }

    @Step("Проверяем текст кнопки <Оформить заказ>")
    public String checkButtonOrder() {
        return driver.findElement(BUTTON_ORDER).getText();
    }

    @Step("Проверяем текст в конструкторе <Соберите бургер>")
    public String checkHeaderContructor() {
        return driver.findElement(MAIN_PAGE_HEADER_TEXT).getText();
    }
}