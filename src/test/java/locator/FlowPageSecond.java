package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;

public class FlowPageSecond {
    public WebDriver driver;
    //Когда привезти самокат
    public By deliveryDate = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div/div/input");
    //Срок Аренды
    public By rentalPeriod = By.className("Dropdown-placeholder");
    // Выбор срока аренды 2е суток
    public By rentalPeriodInDays = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div[2][text() = 'двое суток']");
    //Цвет самоката
    public By color = By.id("black");
    //Комментарий для курьера
    public By coment = By.xpath("/html/body/div/div/div[2]/div[2]/div[4]/input");
    //Кнопка заказать
    public By order = By.xpath("/html/body/div/div/div[2]/div[3]/button[2]");
    // Кнопка подтверждающая заказ(Да)
    public By confirmOrder = By.xpath("/html/body/div/div/div[2]/div[5]/div[2]/button[2]");
    // Заказ оформлен
    public By theOrderHasBeenPlaced = By.xpath(".//div[text()='Заказ оформлен']");

    public FlowPageSecond(WebDriver driver) {
        this.driver = driver;
    }

    public void deliveryDate() {
        driver.findElement(deliveryDate).sendKeys("17.02.23");
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
        driver.findElement(coment).sendKeys("Можно без звонка");

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
