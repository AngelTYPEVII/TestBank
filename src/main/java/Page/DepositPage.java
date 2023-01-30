package Page;

import Tools.Elements.*;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class DepositPage {
    public final A deposits =new A($x("//a[@id='deposits-index']"));
    public final A btnShowRates =new A($x("//a[@id='btn-show-rates']"));
    public final A opDepos =new A($x("//a[@href='/deposits/form/10184?days=367']"));
    public final Button submitBtn =new Button($x("//button[@id='submit-button']"));
    public final Input sumInput =new Input($x("//input[@id='amount']"));
    public final Input newDeposCondCheckBtn = new Input($x("//input[@name='condition.newDepositConditions']"));
    public final Input instantDeposCondCheckBtn= new Input($x("//input[@name='condition.instantDepositAgreement']"));
    public final A acceptInstantDepositAgreementButton =new A($x("//a[@id='accept-instant-deposit-agreement-button']"));
    public final Button confirm =new Button($x("//button[@id='confirm']"));
    public final SelenideElement scrollTable =$(By.xpath("//td[.='Способ обмена информацией между банком и вкладчиком']"));
    public final Span income =new Span($x("//span[@id='estimated-interest']"));
    public final Scrolling scrollPage = new Scrolling("#contentbar");
}