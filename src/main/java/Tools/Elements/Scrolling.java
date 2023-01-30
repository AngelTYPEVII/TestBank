package Tools.Elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Scrolling {
    private final SelenideElement object;

    public Scrolling(String cssSelector){
        object=$(By.cssSelector(cssSelector));
    }
    public void scrollingForTact(int i){
        for (int tact=i;tact > 0; tact--){
            object.scrollTo();
        }
    }
    public void scrollToObject(){
        object.scrollTo();
    }
    public void scrollBoolean(boolean torf){
        object.scrollIntoView(torf);
    }
    public void scrollString(String string){
        object.scrollIntoView(string);
    }

}