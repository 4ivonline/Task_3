package ru.educationservices.stellarburgers.navigation;

import org.openqa.selenium.WebDriver;
import io.qameta.allure.Step;
import ru.educationservices.stellarburgers.pageobjects.MainPage;
import ru.educationservices.stellarburgers.pageobjects.PasswordRecoveryPage;
import ru.educationservices.stellarburgers.pageobjects.RegisterPage;
import ru.educationservices.stellarburgers.pageobjects.SignInPage;
import ru.educationservices.stellarburgers.pageobjects.MyAccountPage;

public class Navigation {

    private WebDriver driver;
    private MainPage mainPage;
    private SignInPage signInPage;
    private RegisterPage registerPage;
    private PasswordRecoveryPage passwordRecoveryPage;
    private MyAccountPage myAccount;

    public Navigation(WebDriver driver) {

    this.driver = driver;
    this.mainPage = new MainPage(driver);
    this.signInPage = new SignInPage(driver);
    this.registerPage = new RegisterPage(driver);
    this.passwordRecoveryPage = new PasswordRecoveryPage(driver);
    this.myAccount = new MyAccountPage(driver);
}

@Step("Переходим через <Личный кабинет> к странице <Регистрация>")
    public void navigateToRegistration() {

        // Ожидаем загрузки главной страницы
        mainPage.waitForLoadMainPage();

        //Кликаем <Личный кабинет>
        mainPage.clickButtonMyAccount();

        //Ожидание загрузки страницы <Вход>
        signInPage.waitForLoadSignInHeader();

        //Кликаем <Зарегистрироваться>
        signInPage.clickButtonRegistration();

        //Ожидание загрузки страницы <Регистрация>
        registerPage.waitForLoadRegisterHeader();
    }

    @Step("Переходим через кнопку <Войти в аккаунт> к странице <Вход>")
    public void navigateToSignIn() {

        // Ожидаем загрузки главной страницы
        mainPage.waitForLoadMainPage();

        //Кликаем на кнопку <Войти в аккаунт>
        mainPage.clickMainButtonSignIn();

        //Ожидание загрузки страницы <Вход>
        signInPage.waitForLoadSignInHeader();
    }

    @Step("Переходим через <Личный кабинет> к странице <Вход>")
    public void navigateToMyAccountForSignIn() {

        // Ожидаем загрузки главной страницы
        mainPage.waitForLoadMainPage();

        //Кликаем на кнопку <Личный кабинет>
        mainPage.clickButtonMyAccount();

        //Ожидание загрузки страницы <Вход>
        signInPage.waitForLoadSignInHeader();
    }

    @Step("Переходим через страницу <Регистрация> к странице <Вход>")
    public void navigateToSignInByRegistration() {

        // Ожидаем загрузки главной страницы
        mainPage.waitForLoadMainPage();

        //Кликаем <Личный кабинет>
        mainPage.clickButtonMyAccount();

        //Ожидание загрузки страницы <Вход>
        signInPage.waitForLoadSignInHeader();

        //Кликаем <Зарегистрироваться>
        signInPage.clickButtonRegistration();

        //Ожидание загрузки страницы <Регистрация>
        registerPage.waitForLoadRegisterHeader();

        //Кликаем <Войти>
        registerPage.clickButtonSignInByRegistration();

        //Ожидание загрузки страницы <Вход>
        signInPage.waitForLoadSignInHeader();
    }

    @Step("Переходим через страницу <Восстановление пароля> к странице <Вход>")
    public void navigateToSignInByPasswordRecovery() {

        // Ожидаем загрузки главной страницы
        mainPage.waitForLoadMainPage();

        //Кликаем <Личный кабинет>
        mainPage.clickButtonMyAccount();

        //Ожидание загрузки страницы <Вход>
        signInPage.waitForLoadSignInHeader();

        //Кликаем <Восстановить пароль>
        signInPage.clickButtonResetPassword();

        //Ожидание загрузки страницы <Восстановление пароля>
        passwordRecoveryPage.waitForLoadPasswordRecoveryHeader();

        //Кликаем <Войти> на странице <Восстановление пароля>
        passwordRecoveryPage.clickButtonSignInByPasswordRecovery();

        //Ожидание загрузки страницы <Вход>
        signInPage.waitForLoadSignInHeader();
    }

    @Step("Регистрация пользователя")
    public void registrationUser() {

        String email = "tester" + System.currentTimeMillis() + "@test.test";
        String password = "TestUser000";
        String name = "Тестер";

        //Заполняем поле: <Имя>
        registerPage.fillRegisterInputName(name);

        //Заполняем поле: <Email>
        registerPage.fillRegisterEmail(email);

        //Заполняем поле: <Пароль>
        registerPage.fillRegisterPassword(password);

        //Кликаем кнопку <Зарегистрироваться>
        registerPage.clickButtonRegistration();

        //Ожидание загрузки страницы <Вход>
        signInPage.waitForLoadSignInHeader();
    }

    @Step("Авторизация пользователя")
    public void authorizationUser() {

        String email = "tester@test.test";
        String password = "1x2y3x4y";

        //Заполняем поле: <Email>
        signInPage.fillSignInEmail(email);

        //Заполняем поле: <Пароль>
        signInPage.fillSignInPassword(password);

        //Кликаем кнопку <Войти>
        signInPage.clickButtonSignIn();

        //Ожидаем загрузки главной страницы
        mainPage.waitForLoadMainPage();
    }

    @Step("Переходим на страницу <Личный кабинет> авторизованным пользователем")
    public void navigateToMyAccount() {

        //Кликаем на кнопку <Личный кабинет>
        mainPage.clickButtonMyAccount();

        //Ожидание загрузки страницы <Личный кабинет>
        myAccount.waitForLoadPageMyAccount();
    }

    @Step("Разлогиниться пользователя из страницы <Личный кабинет>")
    public void userLogout() {

        //Кликаем <Выход>
        myAccount.clickInMyAccountExit();

        //Ожидание загрузки страницы <Вход>
        signInPage.waitForLoadSignInHeader();
    }
}