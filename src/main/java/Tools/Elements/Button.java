package Tools.Elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;


public class Button extends BaseElement {

    public Button(SelenideElement container) {
        super(container);

    }
    public void clickBtn(){
        container.click();
    }
    public void doubleClickBtn(){
        container.doubleClick();
    }
    public void rightClickBtn(){
        container.contextClick();
    }
    public void checkVisibleAndTimeoutClickBtn(int seconds){
        container.should(Condition.visible, Duration.ofSeconds(seconds)).click();
    }
    public void checkEnabledAndTimeoutClickBtn(int seconds){
        container.shouldBe(Condition.enabled,Duration.ofSeconds(seconds)).click();
    }
    public void checkColorBtn(String css_rgba,int seconds){
        container.should(Condition.cssValue("color","rgba("+css_rgba+")"),Duration.ofSeconds(seconds)).click();
    }
    public void checkVisibleBtn(){
        container.should(Condition.visible).click();
    }
}