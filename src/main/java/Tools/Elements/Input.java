package Tools.Elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class Input extends BaseElement {
    public Input(SelenideElement container) {
        super(container);
    }
    public Input(String name) {
        this($x("//input[@name='" + name + "']"));
    }

    public void setValueInput(String value){
        cleanWithBackspace();
        container.setValue(value);
    }
    public String getValueInput(){
        return container.getValue();
    }
    public void sendKeysBackSpaseInput(){
        container.sendKeys(Keys.BACK_SPACE);
    }
    public void sendKeysEnterInput(){
        container.sendKeys(Keys.ENTER);
    }
    public void uploadFileInput(File file){
        container.uploadFile(file);
    }
    public void checkTextInput(String value){
        container.should(Condition.value(value));
    }
    public void dateInput(String date){
        setValueInput(date);
        for(int i=0;i<10;i++){
            container.sendKeys(Keys.ARROW_LEFT);
        }
        while (getValueInput().length()>10){
            sendKeysBackSpaseInput();
        }
        sendKeysEnterInput();
    }
    public void clickInput(){
        container.click();
    }
    public void cleanWithBackspace() {
        container.sendKeys(Keys.CONTROL + "a");
        container.sendKeys(Keys.BACK_SPACE);
    }
}