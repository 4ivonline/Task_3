package ru.educationservices.stellarburgers.pageobjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static ru.educationservices.stellarburgers.elements.MyAccountElements.*;

public class MyAccountPage {

    private WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }
    @Step("Загрузка страницы <Личный кабинет>")
    public void waitForLoadPageMyAccount() {
        new WebDriverWait(driver, Duration.ofSeconds(7))
                .until(ExpectedConditions.visibilityOfElementLocated(MY_ACCOUNT_PROFILE));
    }

    @Step("Проверяем описание страницы <Личный кабинет>")
    public String checkInputLoginValue() {
        return driver.findElement(MY_ACCOUNT_TEXT).getText();
    }

    @Step("Кликаем на кнопку <Конструктор> в хедере на странице <Личный кабинет>")
    public void clickInMyAccountHeaderLinkConstructor() {
        driver.findElement(MY_ACCOUNT_LINK_CONSTRUCTOR).click();
    }

    @Step("Кликаем на логотип <Stellar Burgers> в хедере на странице <Личный кабинет>")
    public void clickInMyAccountHeaderLogo() {
        driver.findElement(MY_ACCOUNT_LOGO).click();
    }

    @Step("Кликаем <Выход> на странице <Личный кабинет>")
    public void clickInMyAccountExit() {
        driver.findElement(MY_ACCOUNT_EXIT).click();
    }
}