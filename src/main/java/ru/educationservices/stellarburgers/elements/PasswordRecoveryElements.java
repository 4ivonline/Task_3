package ru.educationservices.stellarburgers.elements;

import org.openqa.selenium.By;

public class PasswordRecoveryElements {

    //Заголовок <Восстановление пароля>
    public static final By PASSWORD_RECOVEY_HEADER = By.xpath("//h2[text()='Восстановление пароля']");

    //Текстовая ссылка <Войти>
    public static final By PASSWORD_RECOVEY_SIGNIN = By.xpath("//a[contains(@class, 'Auth_link')]");
}