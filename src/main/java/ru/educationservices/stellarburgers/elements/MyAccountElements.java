package ru.educationservices.stellarburgers.elements;

import org.openqa.selenium.By;

public class MyAccountElements {

    // Раздел <Профиль> на странице <Личный кабинет>
    public static final By MY_ACCOUNT_PROFILE = By.xpath("//*[text()='Профиль']");

    //Текст описание страницы <Личный кабинет>
    public static final By MY_ACCOUNT_TEXT = By.xpath("//p[text()='В этом разделе вы можете изменить свои персональные данные']");

    //Кнопка <Конструктор> на странице <Личный кабинет>
    public static final By MY_ACCOUNT_LINK_CONSTRUCTOR = By.xpath("//a[contains(@class, 'AppHeader_header') and (@href='/')]");

    //Логотип в хедере на странице <Личный кабинет>
    public static final By MY_ACCOUNT_LOGO = By.xpath("//div[contains(@class, 'AppHeader_header__logo')]/a[(@href='/')]");

    //Кнопка <Выход> на странице <Личный кабинет>
    public static final By MY_ACCOUNT_EXIT = By.xpath("//button[contains(@class, 'Account_button') and (text()='Выход')]");
}