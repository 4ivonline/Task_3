package ru.educationservices.stellarburgers;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.educationservices.stellarburgers.pageobjects.*;

public class MyAccountTest extends BaseTest {

    @ParameterizedTest
    @ValueSource(strings = {"chrome", "yandex"})
    @DisplayName("Переход в <Личный кабинет> авторизованным пользователем - успешно")
    public void openMyAccountPageSuccess(String browserName) {

        //Переключаем браузер
        changeBrowser(browserName);

        //Инициализируем page objects
        initPageObject();

        //Открываем страницу <Вход>
        navigation.navigateToMyAccountForSignIn();

        //Авторизуемся пользователем
        navigation.authorizationUser();

        //Переходим в <Личный кабинет>
        navigation.navigateToMyAccount();

        // Проверяем результат
        Assertions.assertEquals("В этом разделе вы можете изменить свои персональные данные", myAccountPage.checkInputLoginValue(),
                "Текст не соответствует ожидаемому результату. Браузер: " + browserName);
    }

    @ParameterizedTest
    @ValueSource(strings = {"chrome", "yandex"})
    @DisplayName("Переход в <Конструктор> через <Личный кабинет> авторизованным пользователем - успешно")
    public void clickConstruktorInMyAccountSuccess(String browserName) {

        //Переключаем браузер
        changeBrowser(browserName);

        //Инициализируем page objects
        initPageObject();

        //Открываем страницу <Вход>
        navigation.navigateToSignIn();

        //Авторизуемся пользователем
        navigation.authorizationUser();

        //Переходим в <Личный кабинет>
        navigation.navigateToMyAccount();

        //Кликаем на ссылку <Конструктор>
        myAccountPage.clickInMyAccountHeaderLinkConstructor();

        // Проверяем результат
        Assertions.assertEquals("Соберите бургер", mainPage.checkHeaderContructor(),
                "Страница не соответствует ожидаемому результату. Браузер: " + browserName);
    }

    @ParameterizedTest
    @ValueSource(strings = {"chrome", "yandex"})
    @DisplayName("Переход в <Конструктор> через нажатие на логотип в <Личном кабинете> авторизованным пользователем - успешно")
    public void clickLogoInMyAccountSuccess(String browserName) {

        //Переключаем браузер
        changeBrowser(browserName);

        //Инициализируем page objects
        initPageObject();

        //Открываем страницу <Вход>
        navigation.navigateToSignIn();

        //Авторизуемся пользователем
        navigation.authorizationUser();

        //Переходим в <Личный кабинет>
        navigation.navigateToMyAccount();

        //Кликаем на логотип <Stellar Burgers>
        myAccountPage.clickInMyAccountHeaderLogo();

        // Проверяем результат
        Assertions.assertEquals("Соберите бургер", mainPage.checkHeaderContructor(),
                "Страница не соответствует ожидаемому результату. Браузер: " + browserName);
    }

    @ParameterizedTest
    @ValueSource(strings = {"chrome", "yandex"})
    @DisplayName("Выход из пользователя через страницу <Личный кабинет> - успешно")
    public void exitUserInMyAccountSuccess(String browserName) {

        //Переключаем браузер
        changeBrowser(browserName);

        //Инициализируем page objects
        initPageObject();

        //Открываем страницу <Вход>
        navigation.navigateToSignIn();

        //Авторизуемся пользователем
        navigation.authorizationUser();

        //Переходим в <Личный кабинет>
        navigation.navigateToMyAccount();

        //Кликаем <Выход>
        navigation.userLogout();

        // Проверяем результат
        Assertions.assertEquals("Вход", signInPage.checkHeaderSignIn(),
                "Страница не соответствует ожидаемому результату. Браузер: " + browserName);
    }
}