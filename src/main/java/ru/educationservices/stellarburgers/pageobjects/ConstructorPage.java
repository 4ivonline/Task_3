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
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Step("Проверяем таб <Соусы> на активность")
    public boolean checkTabSauceActive() {
        return driver.findElement(CONSTRUCTROR_TAB_SUCE_ACTIVE).isDisplayed();
    }

    @Step("Кликаем на таб <Начинки>")
    public void clickTabFilling() {
        driver.findElement(CONSTRUCTROR_TAB_FILLING).click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Step("Проверяем таб <Начинки> на активность")
    public boolean checkTabFillingActive() {
        return driver.findElement(CONSTRUCTROR_TAB_FILLING_ACTIVE).isDisplayed();
    }

    @Step("Кликаем на таб <Булки>")
    public void clickTabBulki() {
        driver.findElement(CONSTRUCTROR_TAB_BULKI).click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Step("Проверяем таб <Булки> на активность")
    public boolean checkTabBulkiActive() {
        return driver.findElement(CONSTRUCTROR_TAB_BULKI_ACTIVE).isDisplayed();
    }
}