package Tests.Payments;

import Tests.BaseTest;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Платежи и переводы")
public class Test02 extends BaseTest {
    @Test
    @DisplayName("Создание запроса на перевод")
    public void test2(){
        step1();
        step2();
        step3("100000");
        step4("На ультра комп");
        step5();
    }

    @Step("Переход на страницу \"Платежи и переводы\"")
    private void step1(){
        paymentsPage.paymentsForm.clickA();
    }
    @Step("Открытие страницы \"Запрос платежа\"")
    private void step2(){
        paymentsPage.scrolling.scrollToObject();
        paymentsPage.menu.findBy(Condition.exactText("Request money")).click();
    }
    @Step("Ввод суммы")
    private void step3(String sum){
        paymentsPage.moneySum.setValueInput(sum);
    }
    @Step("Ввод комментария")
    private void step4(String text){
        paymentsPage.description.setValueTextArea(text);
    }
    @Step("Нажатие кнопки \"подтвердить\"")
    private void step5(){
        paymentsPage.forward.clickBtn();
    }
}
