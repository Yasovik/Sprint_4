
import io.github.bonigarcia.wdm.WebDriverManager;
import locator.ElementsHomePage;
import locator.FlowPage;
import locator.FlowPageSecond;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TestSamokat extends ElementsHomePage {
    private WebDriver driver;



    @Test
    public void textButtonAccordeon() {
        driver = new ChromeDriver();
        //WebDriverManager.firefoxdriver().setup();
        //driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        WebElement element = driver.findElement(By.id("accordion__heading-0"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

        driver.findElement(accordion1).click();

        new WebDriverWait(driver, 3).until(driver -> (driver.findElement(openAccordion1).getText() != null
                && !driver.findElement(openAccordion1).getText().isEmpty()));

        String textOpenAccordion1 = driver.findElement(openAccordion1).getText();
        assertEquals("Текст не соответствует", "Сутки — 400 рублей. Оплата курьеру — наличными или картой.", textOpenAccordion1);

        driver.findElement(accordion2).click();

        new WebDriverWait(driver, 3).until(driver -> (driver.findElement(openAccordion2).getText() != null
                && !driver.findElement(openAccordion2).getText().isEmpty()));

        String textOpenAccordion2 = driver.findElement(openAccordion2).getText();
        assertEquals("Текст не соответствует", "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", textOpenAccordion2);

        driver.findElement(accordion3).click();

        new WebDriverWait(driver,3).until(driver -> (driver.findElement(openAccordion3).getText() != null
                && !driver.findElement(openAccordion3).getText().isEmpty()));

        String textOpenAccordion3 = driver.findElement(openAccordion3).getText();
        assertEquals("Текст не соответствует", "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", textOpenAccordion3);

        driver.findElement(accordion4).click();

        new WebDriverWait(driver,3).until(driver -> (driver.findElement(openAccordion4).getText() != null
                && !driver.findElement(openAccordion4).getText().isEmpty()));

        String textOpenAccordion4 = driver.findElement(openAccordion4).getText();
        assertEquals("Текст не соответствует", "Только начиная с завтрашнего дня. Но скоро станем расторопнее.", textOpenAccordion4);

        driver.findElement(accordion5).click();

        new WebDriverWait(driver, 3).until(driver -> (driver.findElement(openAccordion5).getText() != null
                && !driver.findElement(openAccordion5).getText().isEmpty()));

        String textOpenAccordion5 = driver.findElement(openAccordion5).getText();
        assertEquals("Текст не соответствует", "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", textOpenAccordion5);

        driver.findElement(accordion6).click();

        new WebDriverWait(driver, 3).until(driver -> (driver.findElement(openAccordion6).getText() != null
                && !driver.findElement(openAccordion6).getText().isEmpty()));

        String textOpenAccordion6 = driver.findElement(openAccordion6).getText();
        assertEquals("Текст не соответствует", "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", textOpenAccordion6);

        driver.findElement(accordion7).click();

        new WebDriverWait(driver, 3).until(driver -> (driver.findElement(openAccordion7).getText() != null
                && !driver.findElement(openAccordion7).getText().isEmpty()));

        String textOpenAccordion7 = driver.findElement(openAccordion7).getText();
        assertEquals("Текст не соответствует", "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", textOpenAccordion7);

        driver.findElement(cockieCloseButton).click();
        driver.findElement(accordion8).click();

        new WebDriverWait(driver, 3).until(driver -> (driver.findElement(openAccordion8).getText() != null
                && !driver.findElement(openAccordion8).getText().isEmpty()));

        String textOpenAccordion8 = driver.findElement(openAccordion8).getText();
        assertEquals("Текст не соответствует", "Да, обязательно. Всем самокатов! И Москве, и Московской области.", textOpenAccordion8);


        }


        @Test
        public void positiveMainScenario() {
            //WebDriverManager.firefoxdriver().setup();
            //driver = new FirefoxDriver();
            driver = new ChromeDriver();
            driver.get("https://qa-scooter.praktikum-services.ru/");

            driver.findElement(clickBuyButtonUp).click();

            FlowPage objFlow = new FlowPage(driver);
            FlowPageSecond objFlowSecond = new FlowPageSecond(driver);
            objFlow.fillInTheFirstPage();
            objFlowSecond.fillInTheSecondPage();
        }

        @Test
    public void positiveMainScenarioSecond() {
            //WebDriverManager.firefoxdriver().setup();
            //driver = new FirefoxDriver();
            driver = new ChromeDriver();
            driver.get("https://qa-scooter.praktikum-services.ru/");
            driver.findElement(cockieCloseButton).click();
            driver.findElement(clickBuyButtonDown).click();
            FlowPage objFlow = new FlowPage(driver);
            FlowPageSecond objFlowSecond = new FlowPageSecond(driver);
            objFlow.fillInTheFirstPageSecond();
            objFlowSecond.fillInTheSecondPage();



        }
        @After
    public void teardown() {
        driver.quit();
    }

    }



