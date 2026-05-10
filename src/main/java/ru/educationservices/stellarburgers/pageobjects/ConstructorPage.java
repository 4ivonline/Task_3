package ru.educationservices.stellarburgers.pageobjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

import static ru.educationservices.stellarburgers.elements.ConstructorElements.*;

public class ConstructorPage {

    private WebDriver driver;

    public ConstructorPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Кликаем на таб <Соусы>")
    public void clickTabSauce() {
        driver.findElement(CONSTRUCTROR_TAB_SAUCE).click();
    }

    @Step("Проверяем заголовок блока <Соусы>")
    public String checkHeaderSauce() {
        return driver.findElement(CONSTRUCTROR_TAB_SAUCE_HEADER).getText();
    }

    @Step("Кликаем на таб <Начинки>")
    public void clickTabFilling() {
        driver.findElement(CONSTRUCTROR_TAB_FILLING).click();
    }

    @Step("Проверяем заголовок блока <Начинки>")
    public String checkHeaderFilling() {
        return driver.findElement(CONSTRUCTROR_TAB_FILLING_HEADER).getText();
    }

    @Step("Кликаем на таб <Булки>")
    public void clickTabBulki() {
        driver.findElement(CONSTRUCTROR_TAB_BULKI).click();
    }

    @Step("Проверяем заголовок блока <Булки>")
    public String checkHeaderBulki() {
        return driver.findElement(CONSTRUCTROR_TAB_BULKI_HEADER).getText();
    }
}