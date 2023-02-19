import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.yandex.practicum.AccordionPage;
import ru.yandex.practicum.PageObjectModelOrderSamokat;
import static ru.yandex.practicum.AccordionPage.orderButtonDown;
import static ru.yandex.practicum.AccordionPage.orderButtonUp;
import static ru.yandex.practicum.PageObjectModelOrderSamokat.selectBlack;
import static ru.yandex.practicum.PageObjectModelOrderSamokat.selectGrey;

@RunWith(Parameterized.class)
public class OrderTest {
    private final By orderButton;
    private final String name;
    private final String surname;
    private final String address;
    private final String metroStation;
    private final String phoneNumber;
    private final String date;
    private final String rentalPeriod;
    private final By color;
    private final String comment;
    private WebDriver driver;

    public OrderTest(By orderButton, String name, String surname, String address,
                     String metroStation, String phoneNumber, String date, String rentalPeriod, By color, String comment) {
        this.orderButton = orderButton;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.metroStation = metroStation;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.rentalPeriod = rentalPeriod;
        this.color = color;
        this.comment = comment;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {orderButtonUp,
                        "Александр", "Закурдаев", "Андропова 31, кв 61", "Коломенская", "+79253359989",
                        "19.02.2023", "сутки", selectBlack, "Можно без звонка"},
                {orderButtonDown,
                        "Тест", "Тестович", "Братиславская 29 кв 31", "Братиславская", "89253359989",
                        "21.02.2023", "двое суток", selectGrey, "С 7 до 9"},
        };
    }

    @Test
    public void createNewOrderTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        AccordionPage Accordion = new AccordionPage(driver);
        Accordion.runBrowser();
        Accordion.scrollToOrderButton(orderButton);
        Accordion.clickOrderButton(orderButton);
        PageObjectModelOrderSamokat orderPage = new PageObjectModelOrderSamokat(driver);
        orderPage.setDataFirstPageOrder(name, surname, address, metroStation, phoneNumber);
        orderPage.setDataSecondPageOrder(date, rentalPeriod, color, comment);
        orderPage.clickYesButton();
        boolean isDisplayed = orderPage.isOrderWindowDisplayed();
        Assert.assertTrue(isDisplayed);
        orderPage.getTextFromPopupOrderWindow();
    }

    @After
    public void teardown() {
        driver.quit();
    }
}

