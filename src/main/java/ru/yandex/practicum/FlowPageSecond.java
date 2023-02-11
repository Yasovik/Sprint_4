package ru.yandex.practicum;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FlowPageSecond {
    // Тестовые данные
    private final String date = "17.02.23";
    private final String commentDelivery = "Можно без звонка";
    public WebDriver driver;
    // Кнопка для закрытия куки
    protected By cockieCloseButton = By.className("App_CookieButton__3cvqF");
    // Кнопка Заказать на верху страницы
    protected By clickBuyButtonUp = By.className("Button_Button__ra12g");
    // Кнопка заказать внизу страницы
    protected By clickBuyButtonDown = By.xpath("//div[@class='Home_FinishButton__1_cWm']//button[text()='Заказать']");
    //Когда привезти самокат
    private final By deliveryDate = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    //Срок Аренды
    private final By rentalPeriod = By.className("Dropdown-placeholder");
    // Выбор срока аренды 2е суток
    private final By rentalPeriodInDays = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div[2][text() = 'двое суток']");
    //Цвет самоката
    private final By color = By.id("black");
    //Комментарий для курьера
    private final By comment = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    //Кнопка заказать
    private final By order = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    // Кнопка подтверждающая заказ(Да)
    private final By confirmOrder = By.xpath("/html/body/div/div/div[2]/div[5]/div[2]/button[2]");
    // Заказ оформлен
    private final By theOrderHasBeenPlaced = By.xpath(".//div[text()='Заказ оформлен']");

    public FlowPageSecond(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickBuyButtonUp() {
        driver.findElement(clickBuyButtonUp).click();
    }

    public void ClickBuyButtonDown() {
        driver.findElement(clickBuyButtonDown).click();
    }

    public void clickCockieCloseButton() {
        driver.findElement(cockieCloseButton).click();
    }

    public void deliveryDate() {
        driver.findElement(deliveryDate).sendKeys(date);
        driver.findElement(deliveryDate).sendKeys(Keys.ENTER);

    }

    public void rentalPeriod() {
        driver.findElement(rentalPeriod).click();
        driver.findElement(rentalPeriodInDays).click();

    }

    public void color() {
        driver.findElement(color).click();

    }

    public void coment() {
        driver.findElement(comment).sendKeys(commentDelivery);

    }

    public void order() {
        driver.findElement(order).click();

    }

    public void confirmOrder() {
        driver.findElement(confirmOrder).click();

    }

    public void textTheOrderHasBeenPlaced() {
        System.out.println(driver.findElement(theOrderHasBeenPlaced).getText());

    }

    public void fillInTheSecondPage() {
        deliveryDate();
        rentalPeriod();
        color();
        coment();
        order();
        confirmOrder();
        textTheOrderHasBeenPlaced();


    }


}
