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
        Assertions.assertEquals("Начинки", constructorPage.checkHeaderFilling(),
                "Таб не соответствует ожидаемому результату. Браузер: " + browserName);
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
        Assertions.assertEquals("Соусы", constructorPage.checkHeaderSauce(),
                "Таб не соответствует ожидаемому результату. Браузер: " + browserName);
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
        Assertions.assertEquals("Булки", constructorPage.checkHeaderBulki(),
                "Таб не соответствует ожидаемому результату. Браузер: " + browserName);
    }
}