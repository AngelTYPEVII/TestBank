package Page;

import Tools.Elements.*;
import com.codeborne.selenide.ElementsCollection;


import static com.codeborne.selenide.Selenide.*;

public class PaymentsPage {
    public final A paymentsForm= new A($x("//a[@id='payments-form']"));
    public final Button forward = new Button($x("//button[@id='forward']"));
    public final ElementsCollection menu = $$("ul#dashboard-payment-type-menu a");

    public final Scrolling scrolling =new Scrolling("#contentbar");
    public final Input moneySum = new Input($x("//input[@name='cardPaymentRequest.amount']"));
    public final TextArea description =new TextArea($x("//textArea[@name='cardPaymentRequest.details']"));

    public final A paymentsPersonal =new A($x("//a[@href='/payments/personal']"));
    public final A asRecurrentLink = new A($x("//a[@id='as-recurrent-link']"));
    public final Input amount= new Input($x("//input[@id='amount']"));
    public final Input paymentComment = new Input("payment.comment");


}
