package Tools.Elements;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TextArea extends BaseElement {

    public TextArea(SelenideElement container) {
        super(container);
    }
    public void setValueTextArea(String value) {
        container.setValue(value);
    }
}