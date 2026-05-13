package ru.educationservices.stellarburgers.elements;

import org.openqa.selenium.By;

public class MainPageElements {

    //Текст в конструкторе <Соберите бургер>
    public static final By MAIN_PAGE_HEADER_TEXT = By.xpath("//h1[text()='Соберите бургер']");

    //Кнопка <Личный кабинет>
    public static final By BUTTON_MY_ACCOUNT = By.xpath("//p[text()='Личный Кабинет']");

    //Кнопка <Войти в аккаунт>
    public static final By BUTTON_SIGN_IN = By.xpath("//button[text()='Войти в аккаунт']");

    //Кнопка <Оформить заказ>
    public static final By BUTTON_ORDER = By.xpath("//button[text()='Оформить заказ']");
}