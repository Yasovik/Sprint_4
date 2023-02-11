import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.yandex.practicum.TestAccordionButtonPageObjectModel;

public class TestAccordionButton {
    private WebDriver driver;

    @Test
    public void checkAccordion() {
        WebDriverManager.firefoxdriver().setup();
        //FirefoxDriver driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        TestAccordionButtonPageObjectModel objTestAccordion = new TestAccordionButtonPageObjectModel(driver);
        objTestAccordion.scrollPage();
        objTestAccordion.checkAccordion1();
        objTestAccordion.checkAccordion2();
        objTestAccordion.checkAccordion3();
        objTestAccordion.checkAccordion4();
        objTestAccordion.checkAccordion5();
        objTestAccordion.checkAccordion6();
        objTestAccordion.checkAccordion7();
        objTestAccordion.checkAccordion8();
    }


    @After
    public void teardown() {
        driver.quit();

    }
}
