package Tools.Elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

public class MainMenu{
    private ElementsCollection menu = $$("div.navbar-inner a");
    public void openMenuElement(String elementId){
        menu.find(Condition.id(elementId)).click();
    }
    public void hoverMenuElement(String elementId){
        menu.find(Condition.id(elementId)).hover();
    }
}
