package ru.yandex.practicum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class TestAccordionButtonPageObjectModel {
    public WebDriver driver;

    // Аккордеон1 "Сколько это стоит?? И как оплатить??"
    protected By accordion1 = By.id("accordion__heading-0");

    // Аккордеон2 "Хочу сразу несколько самокатов! Так можно?"
    protected By accordion2 = By.id("accordion__heading-1");
    // Аккордеон3 "Как рассчитывается время аренды?"
    protected By accordion3 = By.id("accordion__heading-2");
    // Аккордеон4 "Можно ли заказать самокат прямо на сегодня?"
    protected By accordion4 = By.id("accordion__heading-3");
    // Аккордеон5 "Можно ли продлить заказ или вернуть самокат раньше?"
    protected By accordion5 = By.id("accordion__heading-4");
    // Аккордеон6 "Вы привозите зарядку вместе с самокатом?"
    protected By accordion6 = By.id("accordion__heading-5");
    // Аккордеон7 "Можно ли отменить заказ?"
    protected By accordion7 = By.id("accordion__heading-6");
    // Аккордеон8 "Я жизу за МКАДом, привезёте?"
    protected By accordion8 = By.id("accordion__heading-7");
    // Раскрытый аккордеон1 (Сутки — 400 рублей. Оплата курьеру — наличными или картой.)
    protected By openAccordion1 = By.id("accordion__panel-0");
    // Раскрытый аккордеон2 (Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.)
    protected By openAccordion2 = By.id("accordion__panel-1");
    // Раскрытый аккордеон3 (Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.)
    protected By openAccordion3 = By.id("accordion__panel-2");
    // Раскрытый аккордеон4 (Только начиная с завтрашнего дня. Но скоро станем расторопнее.)
    protected By openAccordion4 = By.id("accordion__panel-3");
    // Раскрытый аккордеон5 (Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.)
    protected By openAccordion5 = By.id("accordion__panel-4");
    // Раскрытый аккордеон6 (Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.)
    protected By openAccordion6 = By.id("accordion__panel-5");
    // Раскрытый аккордеон7 (Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.)
    protected By openAccordion7 = By.id("accordion__panel-6");
    // Раскрытый аккордеон8 (Да, обязательно. Всем самокатов! И Москве, и Московской области.)
    protected By openAccordion8 = By.id("accordion__panel-7");
    // Кнопка для закрытия куки
    protected By cockieCloseButton = By.className("App_CookieButton__3cvqF");

    public TestAccordionButtonPageObjectModel(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollPage() {
        WebElement element = driver.findElement(By.id("accordion__heading-0"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void waitElement() {
        new WebDriverWait(driver, 3).until(driver -> (driver.findElement(openAccordion1).getText() != null
                && !driver.findElement(openAccordion1).getText().isEmpty()));
    }

    public void checkAccordion1() {
        driver.findElement(accordion1).click();
        waitElement();
        String textOpenAccordion1 = driver.findElement(openAccordion1).getText();
        assertEquals("Текст не соответствует", "Сутки — 400 рублей. Оплата курьеру — наличными или картой.", textOpenAccordion1);
    }

    public void checkAccordion2() {
        driver.findElement(accordion2).click();
        new WebDriverWait(driver, 3).until(driver -> (driver.findElement(openAccordion2).getText() != null
                && !driver.findElement(openAccordion2).getText().isEmpty()));
        String textOpenAccordion2 = driver.findElement(openAccordion2).getText();
        assertEquals("Текст не соответствует", "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", textOpenAccordion2);


    }

    public void checkAccordion3() {
        driver.findElement(accordion3).click();
        new WebDriverWait(driver, 3).until(driver -> (driver.findElement(openAccordion3).getText() != null
                && !driver.findElement(openAccordion3).getText().isEmpty()));
        String textOpenAccordion3 = driver.findElement(openAccordion3).getText();
        assertEquals("Текст не соответствует", "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", textOpenAccordion3);
    }

    public void checkAccordion4() {
        driver.findElement(accordion4).click();
        new WebDriverWait(driver, 3).until(driver -> (driver.findElement(openAccordion4).getText() != null
                && !driver.findElement(openAccordion4).getText().isEmpty()));
        String textOpenAccordion4 = driver.findElement(openAccordion4).getText();
        assertEquals("Текст не соответствует", "Только начиная с завтрашнего дня. Но скоро станем расторопнее.", textOpenAccordion4);
    }

    public void checkAccordion5() {
        driver.findElement(accordion5).click();
        new WebDriverWait(driver, 3).until(driver -> (driver.findElement(openAccordion5).getText() != null
                && !driver.findElement(openAccordion5).getText().isEmpty()));
        String textOpenAccordion5 = driver.findElement(openAccordion5).getText();
        assertEquals("Текст не соответствует", "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", textOpenAccordion5);
    }

    public void checkAccordion6() {
        driver.findElement(accordion6).click();
        new WebDriverWait(driver, 3).until(driver -> (driver.findElement(openAccordion6).getText() != null
                && !driver.findElement(openAccordion6).getText().isEmpty()));
        String textOpenAccordion6 = driver.findElement(openAccordion6).getText();
        assertEquals("Текст не соответствует", "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", textOpenAccordion6);
    }

    public void checkAccordion7() {
        driver.findElement(accordion7).click();
        new WebDriverWait(driver, 3).until(driver -> (driver.findElement(openAccordion7).getText() != null
                && !driver.findElement(openAccordion7).getText().isEmpty()));
        String textOpenAccordion7 = driver.findElement(openAccordion7).getText();
        assertEquals("Текст не соответствует", "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", textOpenAccordion7);
    }

    public void checkAccordion8() {
        driver.findElement(cockieCloseButton).click();
        driver.findElement(accordion8).click();
        new WebDriverWait(driver, 3).until(driver -> (driver.findElement(openAccordion8).getText() != null
                && !driver.findElement(openAccordion8).getText().isEmpty()));
        String textOpenAccordion8 = driver.findElement(openAccordion8).getText();
        assertEquals("Текст не соответствует", "Да, обязательно. Всем самокатов! И Москве, и Московской области.", textOpenAccordion8);
    }
}
