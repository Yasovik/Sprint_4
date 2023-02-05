package locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FlowPage {

    public WebDriver driver;

    // Поля для ввода имени
    public By inputName = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/input");
    // Поле для ввода фамилии
    public By inputSurname = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/input");
    // Поле для ввода Адреса
    public By inputAdress = By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/input");
    // Клик по полю Выбор станции метро
    public By inputMetro = By.className("select-search__input");
    // Поле станция метро
    public By inputMetroStation = By.className("Order_Text__2broi");
    // Поле телефон
    public By inputPhone = By.xpath("/html/body/div/div/div[2]/div[2]/div[5]/input");
    // Кнопка далее
    public By clickNextButton = By.xpath("/html/body/div/div/div[2]/div[3]/button");

    public FlowPage(WebDriver driver) {
        this.driver = driver;
    }


    public void inputName() {
        driver.findElement(inputName).sendKeys("Александр");

    }
    public void inputSurname() {
        driver.findElement(inputSurname).sendKeys("Закурдаев");

    }
    public void inputAdress() {
        driver.findElement(inputAdress).sendKeys("Москва Андропова 31 кв 61");

    }
    public void inputPhone() {
        driver.findElement(inputPhone).sendKeys("89251971085");

    }
    //Данные 2
    public void inputNameSecond() {
        driver.findElement(inputName).sendKeys("Тест");

    }
    public void inputSurnameSecond() {
        driver.findElement(inputSurname).sendKeys("Тестович");

    }
    public void inputAdressSecond() {
        driver.findElement(inputAdress).sendKeys("Москва Братиславская 18 кв 31");

    }
    public void inputPhoneSecond() {
        driver.findElement(inputPhone).sendKeys("89253359989");

    }
    public void inputMetro() {
        driver.findElement(inputMetro).click();

    }
    public void inputMetroStation() {
        driver.findElement(inputMetroStation).click();

    }
    public void clickNextButton() {
        driver.findElement(clickNextButton).click();

    }
    public void fillInTheFirstPage() {
        inputName();
        inputSurname();
        inputAdress();
        inputPhone();
        inputMetro();
        inputMetroStation();
        clickNextButton();




    }
    public void fillInTheFirstPageSecond(){
        inputNameSecond();
        inputSurnameSecond();
        inputAdressSecond();
        inputPhoneSecond();
        inputMetro();
        inputMetroStation();
        clickNextButton();

    }

}




