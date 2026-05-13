package ru.educationservices.stellarburgers;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.educationservices.stellarburgers.pageobjects.RegisterPage;

public class RegisterTest extends BaseTest {

    @ParameterizedTest
    @ValueSource(strings = {"chrome", "yandex"})
    @DisplayName("Регистрация нового пользователя - успешно")
    public void registerNewUserSuccess(String browserName) {

        //Переключаем браузер
        changeBrowser(browserName);

        //Инициализируем page objects
        initPageObject();

        //Открываем страницу <Регистрация>
        navigation.navigateToRegistration();

        //Регистрируем пользователя
        navigation.registrationUser();

        // Проверяем результат
        Assertions.assertEquals("Вход", signInPage.checkHeaderSignIn(),
                "После регистрации страница входа - не открылась. Браузер: " + browserName);
    }

    @ParameterizedTest
    @ValueSource(strings = {"chrome", "yandex"})
    @DisplayName("Ввод некорректного пароля в поле <Пароль> - ошибка")
    public void textErrorPasswordRegistrationError(String browserName) {

        // Переключаем браузер
        changeBrowser(browserName);

        // Инициализируем page objects
        initPageObject();

        String email = "toster" + System.currentTimeMillis() + "@test.test";
        String name = "Тостер";
        String password = "123";

        //Открываем страницу <Регистрация>
        navigation.navigateToRegistration();

        //Заполняем поле: <Имя>
        registerPage.fillRegisterInputName(name);

        //Заполняем поле: <Email>
        registerPage.fillRegisterEmail(email);

        //Заполняем поле: <Пароль>
        registerPage.fillRegisterPassword(password);

        //Кликаем кнопку <Зарегистрироваться>
        registerPage.clickButtonRegistration();

        // Проверяем результат
        Assertions.assertEquals("Некорректный пароль", registerPage.checkErrorTextPassword(),
                "Текст ошибки не соответствует ожидаемому результату");
    }
}