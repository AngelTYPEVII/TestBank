package Tools.Elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

public abstract class BaseElement {
    protected SelenideElement container;

    public BaseElement(SelenideElement container) {
        this.container = container;
    }

    public boolean isVisibility() {
        return container.is(Condition.visible);
    }

    public void checkVisibility(Boolean isVisible) {
        if (isVisible) {
            container.shouldBe(Condition.visible);
        } else {
            container.shouldNotBe(Condition.visible);
        }
    }

    public void checkEnabled(Boolean isEnabled) {
        if (isEnabled) {
            container.shouldBe(Condition.enabled);
        } else {
            container.shouldBe(Condition.disabled);
        }
    }

    public void checkExist(Boolean isExist) {
        if (isExist) {
            container.shouldBe(Condition.exist);
        } else {
            container.shouldNotBe(Condition.exist);
        }
    }

    @Step("Получить текст элемента")
    public String getText() {
        return container.text();
    }

    @Step("Получить значение элемента")
    public String getValue() {
        return container.getValue();
    }

    public void existValue(String value) {
        container.shouldHave(Condition.exactValue(value));
    }

    public void existValue(int value) {
        container.shouldHave(Condition.exactValue(String.valueOf(value)));
    }
}