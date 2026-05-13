package ru.educationservices.stellarburgers.elements;

import org.openqa.selenium.By;

public class ConstructorElements {

    //В конструкторе таб <Булки>
    public static final By CONSTRUCTROR_TAB_BULKI = By.xpath("//div[contains(@class, 'tab')]/span[(text()='Булки')]");

    //Активный таб <Булки>
    public static final By CONSTRUCTROR_TAB_BULKI_ACTIVE = By.xpath("//div[contains(@class, 'current')]/span[text()='Булки']");

    //В конструкторе таб <Соусы>
    public static final By CONSTRUCTROR_TAB_SAUCE = By.xpath("//div[contains(@class, 'tab')]/span[(text()='Соусы')]");

    //Активный таб <Соусы>
    public static final By CONSTRUCTROR_TAB_SUCE_ACTIVE = By.xpath("//div[contains(@class, 'current')]/span[text()='Соусы']");

    //В конструкторе таб <Начинки>
    public static final By CONSTRUCTROR_TAB_FILLING = By.xpath("//div[contains(@class, 'tab')]/span[(text()='Начинки')]");

    //Активный таб <Начинки>
    public static final By CONSTRUCTROR_TAB_FILLING_ACTIVE = By.xpath("//div[contains(@class, 'current')]/span[text()='Начинки']");
}