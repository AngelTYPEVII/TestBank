package Tools.WebDrivers;

import com.codeborne.selenide.WebDriverProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.annotation.Nonnull;

import static org.openqa.selenium.remote.CapabilityType.PAGE_LOAD_STRATEGY;

public class WebDriver implements WebDriverProvider {
    public org.openqa.selenium.WebDriver driver;

    @Nonnull
    @Override
    public org.openqa.selenium.WebDriver createDriver(@Nonnull Capabilities capabilities) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("--start-maximized");
        options.merge(capabilities);
        options.setCapability(PAGE_LOAD_STRATEGY, "normal");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        return driver;
    }
}