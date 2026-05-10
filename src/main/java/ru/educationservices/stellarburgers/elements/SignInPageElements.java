package ru.educationservices.stellarburgers.elements;

import org.openqa.selenium.By;

public class SignInPageElements {

    //Заголовок <Вход>
    public static final By HEADER_LOGIN = By.xpath("//h2[text()='Вход']");

    //Поле <Email>
    public static final By LOGIN_EMAIL = By.xpath("(//input[contains(@class, 'text input')])[1]");

    //Поле <Password>
    public static final By LOGIN_PASSWORD = By.xpath("(//input[contains(@class, 'text input')])[2]");

    //Кнопка <Войти>
    public static final By LOGIN_BUTTON_SIGNIN = By.xpath("//*[text()='Войти']");

    //Кнопка <Зарегистрироваться>
    public static final By LOGIN_BUTTON_REGISTRATION = By.xpath("//*[text()='Зарегистрироваться']");

    //Кнопка <Восстановить пароль>
    public static final By LOGIN_BUTTON_RESET_PASSWORD = By.xpath("//*[text()='Восстановить пароль']");
}