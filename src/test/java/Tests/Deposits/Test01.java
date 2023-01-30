package Tests.Deposits;

import Tests.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Вклады")
public class Test01 extends BaseTest {
    @Test
    @DisplayName("Создание вклада")
    public void test1(){
        step_1();
        step_2();
        step_3();
        step_4("100000","17 999.99 ₽");
        step_5();
        step_6();
        step_7();
        step_8();
    }

    @Step("Открывает страницу вклады")
    public void step_1(){
        depositPage.deposits.clickA();
    }
    @Step("Нажатие кнопки \"Открыть вклад\"")
    public void step_2(){
        depositPage.btnShowRates.clickA();
    }
    @Step("Открывает вклад\"Демо Стратег онлайн\"")
    public void step_3(){
        depositPage.opDepos.clickA();
    }
    @Step("Ввод суммы и высчитывание дохода")
    public void step_4(String value,String text){
        depositPage.sumInput.setValueInput(value);
        depositPage.income.checkTextSpan(text);
    }
    @Step("Нажатие кнопки \"Дальше\"")
    public void step_5(){
        depositPage.submitBtn.clickBtn();
    }
    @Step("Простановка соглашений")
    public void step_6(){
        depositPage.scrollPage.scrollToObject();
        depositPage.newDeposCondCheckBtn.clickInput();
        depositPage.instantDeposCondCheckBtn.clickInput();
    }
    @Step("Ознакомление и подтверждение соглашения")
    public void step_7() {
        depositPage.scrollTable.scrollIntoView(true);
        depositPage.acceptInstantDepositAgreementButton.clickA();
    }
    @Step("Нажатие кнопки \"Подтвердить\"")
    public void step_8(){
        depositPage.confirm.clickBtn();
    }
}