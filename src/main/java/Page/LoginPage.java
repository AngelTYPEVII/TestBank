package Page;

import Tools.Elements.Button;
import Tools.Elements.Input;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    private final Input userName = new Input("username");
    private final Input userPassword = new Input("password");
    private final Button loginBtn = new Button($(By.cssSelector("#login-button")));
    private final Input codeInput = new Input($x("//input[@id='otp-code']"));
    private final Button codeBtn = new  Button($(By.cssSelector("#login-otp-button")));

    @Step("Ввод логина")
    public void inputName(String name) {
        userName.setValueInput(name);
    }
    @Step("Ввод паоля")
    public void inputPass(String pass){
        userPassword.setValueInput(pass);
    }
    @Step("Нажатие кнопки \"Войти\"")
    public void clickLoginBtn() {
        loginBtn.clickBtn();
    }
    @Step("Ввод кода")
    public void inputCode(String code){
        codeInput.setValueInput(code);
    }
    @Step("Нажатие кнопки \"Войти\"")
    public void clickCodeBtn(){
        codeBtn.clickBtn();
    }
}
