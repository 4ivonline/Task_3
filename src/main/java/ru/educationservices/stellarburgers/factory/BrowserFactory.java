package ru.educationservices.stellarburgers.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

    public static WebDriver getDriver(String browserName) {

        switch(browserName) {

            case "chrome":
                WebDriverManager.chromedriver().setup();

                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--no-sandbox", "--disable-dev-shm-usage");
                return new ChromeDriver(chromeOptions);

            case "yandex":
                WebDriverManager.chromedriver().browserVersion("146").setup();

                ChromeOptions yandexOptions = new ChromeOptions();
                yandexOptions.setBinary("/Applications/Yandex.app/Contents/MacOS/Yandex");
                yandexOptions.addArguments("--no-sandbox", "--disable-dev-shm-usage");
                return new ChromeDriver(yandexOptions);

            default:
                throw new IllegalArgumentException("Браузер не поддерживается: " + browserName);
        }
    }
}