package Tests;

import Interfasces.IAll;
import Persons.IPerson;
import Tools.WebDrivers.WebDriver;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest implements IAll, IPerson {


    @BeforeAll
    static void beforeConfig() {
        Configuration.browser= WebDriver.class.getName();
        Configuration.timeout = 10000;

    }
    @BeforeEach
    public void before() {
        open(baseUrl);
        WebDriverRunner.getWebDriver().manage().window().maximize();
        login();
    }
    @Step("Авторизация на сайтие")
    public static void login(){
        loginPage.inputName(demoPerson.getName());
        loginPage.inputPass(demoPerson.getPassword());
        loginPage.clickLoginBtn();
        loginPage.inputCode("0000");
        loginPage.clickCodeBtn();
    }
    @AfterEach
    public void after() {}
}
