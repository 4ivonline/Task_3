package ru.educationservices.stellarburgers;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SignInTest extends BaseTest {

    @ParameterizedTest
    @ValueSource(strings = {"chrome", "yandex"})
    @DisplayName("Авторизация пользователя по кнопке <Войти в аккаунт> - успешно")
    public void signInButtonSuccess(String browserName) {

        //Переключаем браузер
        changeBrowser(browserName);

        //Инициализируем page objects
        initPageObject();

        //Переходим через кнопку <Войти в аккаунт> на страницу <Вход>
        navigation.navigateToSignIn();

        //Авторизуемся пользователем <Вход>
        navigation.authorizationUser();

        // Проверяем результат
        Assertions.assertEquals("Оформить заказ", mainPage.checkButtonOrder(),
                "Кнопка не найдена. Браузер: " + browserName);
    }

    @ParameterizedTest
    @ValueSource(strings = {"chrome", "yandex"})
    @DisplayName("Авторизация пользователя по кнопке <Личный кабинет> - успешно")
    public void signInButtonMyAccountSuccess(String browserName) {

        //Переключаем браузер
        changeBrowser(browserName);

        //Инициализируем page objects
        initPageObject();

        //Открываем страницу <Вход> через <Личный кабинет>
        navigation.navigateToMyAccountForSignIn();

        //Авторизуемся пользователем
        navigation.authorizationUser();

        // Проверяем результат
        Assertions.assertEquals("Оформить заказ", mainPage.checkButtonOrder(),
                "Кнопка не найдена. Браузер: " + browserName);
    }

    @ParameterizedTest
    @ValueSource(strings = {"chrome", "yandex"})
    @DisplayName("Авторизация пользователя по кнопке <Войти> через страницу регистрации - успешно")
    public void signInButtonByRegistrationSuccess(String browserName) {

        //Переключаем браузер
        changeBrowser(browserName);

        //Инициализируем page objects
        initPageObject();

        //Открываем страницу <Вход> через страницу <Регистрация>
        navigation.navigateToSignInByRegistration();

        //Авторизуемся пользователем
        navigation.authorizationUser();

        // Проверяем результат
        Assertions.assertEquals("Оформить заказ", mainPage.checkButtonOrder(),
                "Кнопка не найдена. Браузер: " + browserName);
    }

    @ParameterizedTest
    @ValueSource(strings = {"chrome", "yandex"})
    @DisplayName("Авторизация пользователя по кнопке <Войти> через страницу <Восстановление пароля> - успешно")
    public void signInButtonByPasswordRecoverySuccess(String browserName) {

        //Переключаем браузер
        changeBrowser(browserName);

        //Инициализируем page objects
        initPageObject();

        //Открываем страницу <Вход> через страницу <Восстановление пароля>
        navigation.navigateToSignInByPasswordRecovery();

        //Авторизуемся пользователем
        navigation.authorizationUser();

        // Проверяем результат
        Assertions.assertEquals("Оформить заказ", mainPage.checkButtonOrder(),
                "Кнопка не найдена. Браузер: " + browserName);
    }
}