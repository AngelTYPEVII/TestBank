package Tools.Elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class A extends BaseElement {

    public A(SelenideElement container ){
        super(container);
    }
    public void hoverA(){
        container.hover();
    }
    public void clickA(){
        container.click();
    }

}
