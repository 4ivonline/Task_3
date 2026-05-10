package ru.educationservices.stellarburgers.elements;

import org.openqa.selenium.By;

public class ConstructorElements {

    //В конструкторе таб <Булки>
    public static final By CONSTRUCTROR_TAB_BULKI = By.xpath("//div[contains(@class, 'tab')]/span[(text()='Булки')]");

    //Заголовок <Булки>
    public static final By CONSTRUCTROR_TAB_BULKI_HEADER = By.xpath("//h2[contains(@class, 'text') and (text()='Булки')]");

    //В конструкторе таб <Соусы>
    public static final By CONSTRUCTROR_TAB_SAUCE = By.xpath("//div[contains(@class, 'tab')]/span[(text()='Соусы')]");

    //Заголовок <Соусы>
    public static final By CONSTRUCTROR_TAB_SAUCE_HEADER = By.xpath("//h2[contains(@class, 'text') and (text()='Соусы')]");

    //В конструкторе таб <Начинки>
    public static final By CONSTRUCTROR_TAB_FILLING = By.xpath("//div[contains(@class, 'tab')]/span[(text()='Начинки')]");

    //Заголовок <Начинки>
    public static final By CONSTRUCTROR_TAB_FILLING_HEADER = By.xpath("//h2[contains(@class, 'text') and (text()='Начинки')]");
}