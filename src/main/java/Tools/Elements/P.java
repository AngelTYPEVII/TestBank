package Tools.Elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class P {
    private final SelenideElement p;
    public P(String id){
        p = $(By.cssSelector("p#"+id));
    }
    public void checkTextP(String text){
        p.should(Condition.text(text));
    }
}