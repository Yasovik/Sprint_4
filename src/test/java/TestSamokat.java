import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.yandex.practicum.FlowPage;
import ru.yandex.practicum.FlowPageSecond;

public class TestSamokat {
    private WebDriver driver;

    @Test
    public void positiveMainScenario() {
        WebDriverManager.firefoxdriver().setup();
        //driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        FlowPage objFlow = new FlowPage(driver);
        FlowPageSecond objFlowSecond = new FlowPageSecond(driver);
        objFlowSecond.ClickBuyButtonUp();
        objFlow.fillInTheFirstPage();
        objFlowSecond.fillInTheSecondPage();
    }

    @Test
    public void positiveMainScenarioSecond() {
        WebDriverManager.firefoxdriver().setup();
        //driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        FlowPage objFlow = new FlowPage(driver);
        FlowPageSecond objFlowSecond = new FlowPageSecond(driver);
        objFlowSecond.clickCockieCloseButton();
        objFlowSecond.ClickBuyButtonDown();
        objFlow.fillInTheFirstPageSecond();
        objFlowSecond.fillInTheSecondPage();

    }

    @After
    public void teardown() {
        driver.quit();
    }

}



