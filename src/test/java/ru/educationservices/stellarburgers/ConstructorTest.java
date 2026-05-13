package ru.educationservices.stellarburgers;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.educationservices.stellarburgers.pageobjects.*;

public class ConstructorTest extends BaseTest {

    @ParameterizedTest
    @ValueSource(strings = {"chrome", "yandex"})
    @DisplayName("Переход в таб <Начинки> в конструкторе - успешно")
    public void clickTabFillingSucces(String browserName) {

        //Переключаем браузер
        changeBrowser(browserName);

        //Инициализируем page objects
        initPageObject();

        //Кликаем таб <Начинки>
        constructorPage.clickTabFilling();

        // Проверяем результат
        Assertions.assertTrue(constructorPage.checkTabFillingActive(),
                "Должен быть активен таб <Начинки>. Браузер: " + browserName);
    }

    @ParameterizedTest
    @ValueSource(strings = {"chrome", "yandex"})
    @DisplayName("Переход в таб <Соусы> в конструкторе - успешно")
    public void clickTabSauceSucces(String browserName) {

        //Переключаем браузер
        changeBrowser(browserName);

        //Инициализируем page objects
        initPageObject();

        //Кликаем таб <Соусы>
        constructorPage.clickTabSauce();

        // Проверяем результат
        Assertions.assertTrue(constructorPage.checkTabSauceActive(),
                "Должен быть активен таб <Соусы>. Браузер: " + browserName);
    }

    @ParameterizedTest
    @ValueSource(strings = {"chrome", "yandex"})
    @DisplayName("Переход в таб <Булки> в конструкторе - успешно")
    public void clickTabBulkiSucces(String browserName) {

        //Переключаем браузер
        changeBrowser(browserName);

        //Инициализируем page objects
        initPageObject();

        //Переключаем на таб <Соусы>
        constructorPage.clickTabSauce();

        //Кликаем таб <Булки>
        constructorPage.clickTabBulki();

        // Проверяем результат
        Assertions.assertTrue(constructorPage.checkTabBulkiActive(),
                "Должен быть активен таб <Булки>. Браузер: " + browserName);
    }
}