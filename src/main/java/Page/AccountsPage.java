package Page;

import Tools.Elements.*;

import static com.codeborne.selenide.Selenide.$x;

public class AccountsPage {
    private final MainMenu menu = new MainMenu();
    public Li cash =new Li($x("//li[@id='cash']"));
    public A newCashApplication = new A($x("//a[@id='new-cash-application']"));
    public Input amount= new Input("cashReservation.amount");
    public Button saveBtn = new Button($x("//button[@id='save']"));
    public A close = new A($x("//a[@id='close-alerts-dialog']"));
    public void findAccounts(){
        menu.hoverMenuElement("accounts-index");
    }
}
