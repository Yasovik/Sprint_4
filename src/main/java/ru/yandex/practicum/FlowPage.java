package ru.yandex.practicum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FlowPage {

    // Набор тестовых данных:
    private final String nameFirst = "Александр";
    private final String nameSecond = "Тест";
    private final String surnameFirst = "Закурдаев";
    private final String surnameSecond = "Тестович";
    private final String adressFirst = "Москва Андропова 31 кв 61";
    private final String adressSecond = "Москва Братиславская 18 кв 31";
    private final String phoneFirst = "89251971085";
    private final String phoneSecond = "89253359989";
    public WebDriver driver;
    // Поля для ввода имени
    private final By inputName = By.xpath(".//input[@placeholder='* Имя']");
    // Поле для ввода фамилии
    private final By inputSurname = By.xpath(".//input[@placeholder='* Фамилия']");
    // Поле для ввода Адреса
    private final By inputAdress = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    // Клик по полю Выбор станции метро
    private final By inputMetro = By.className("select-search__input");
    // Поле станция метро
    private final By inputMetroStation = By.className("Order_Text__2broi");
    // Поле телефон
    private final By inputPhone = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    // Кнопка далее
    private final By clickNextButton = By.cssSelector(".Button_Button__ra12g.Button_Middle__1CSJM");


    public FlowPage(WebDriver driver) {
        this.driver = driver;
    }


    public void inputName() {
        driver.findElement(inputName).sendKeys(nameFirst);

    }

    public void inputSurname() {
        driver.findElement(inputSurname).sendKeys(surnameFirst);

    }

    public void inputAdress() {
        driver.findElement(inputAdress).sendKeys(adressFirst);

    }

    public void inputPhone() {
        driver.findElement(inputPhone).sendKeys(phoneFirst);

    }

    //Данные 2
    public void inputNameSecond() {
        driver.findElement(inputName).sendKeys(nameSecond);

    }

    public void inputSurnameSecond() {
        driver.findElement(inputSurname).sendKeys(surnameSecond);

    }

    public void inputAdressSecond() {
        driver.findElement(inputAdress).sendKeys(adressSecond);

    }

    public void inputPhoneSecond() {
        driver.findElement(inputPhone).sendKeys(phoneSecond);

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

    public void fillInTheFirstPageSecond() {
        inputNameSecond();
        inputSurnameSecond();
        inputAdressSecond();
        inputPhoneSecond();
        inputMetro();
        inputMetroStation();
        clickNextButton();

    }

}




