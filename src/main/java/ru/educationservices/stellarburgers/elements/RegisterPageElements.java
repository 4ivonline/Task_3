package ru.educationservices.stellarburgers.elements;

import org.openqa.selenium.By;

public class RegisterPageElements {

    //Заголовок <Регистрация>
    public static final By REGISTRATION_HEADER = By.xpath("//*[text()='Регистрация']");

    //Поле <Имя>
    public static final By INPUT_NAME = By.xpath("(//input[contains(@class, 'text input')])[1]");

    //Поле <Email>
    public static final By INPUT_EMAIL = By.xpath("(//input[contains(@class, 'text input')])[2]");

    //Поле <Пароль>
    public static final By INPUT_PASSWORD = By.xpath("(//input[contains(@class, 'text input')])[3]");

    //Кнопка <Зарегистрироваться>
    public static final By BUTTON_REGISTRATION = By.xpath("//button[text()='Зарегистрироваться']");

    //Текстовая кнопка <Войти>
    public static final By TEXT_BUTTON_ENTER = By.xpath("//*[text()='Войти']");

    //Текст ошибки поля <Пароль>
    public static final By ERROR_TEXT_PASSWORD = By.xpath("//*[text()='Некорректный пароль']");
}