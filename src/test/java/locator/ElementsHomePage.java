package locator;

import org.openqa.selenium.By;


public class ElementsHomePage {

    // Аккордеон1 "Сколько это стоит?? И как оплатить??"
    public By accordion1 = By.id("accordion__heading-0");

    // Аккордеон2 "Хочу сразу несколько самокатов! Так можно?"
    public By accordion2 = By.id("accordion__heading-1");
    // Аккордеон3 "Как рассчитывается время аренды?"
    public By accordion3 = By.id("accordion__heading-2");
    // Аккордеон4 "Можно ли заказать самокат прямо на сегодня?"
    public By accordion4 = By.id("accordion__heading-3");
    // Аккордеон5 "Можно ли продлить заказ или вернуть самокат раньше?"
    public By accordion5 = By.id("accordion__heading-4");
    // Аккордеон6 "Вы привозите зарядку вместе с самокатом?"
    public By accordion6 = By.id("accordion__heading-5");
    // Аккордеон7 "Можно ли отменить заказ?"
    public By accordion7= By.id("accordion__heading-6");
    // Аккордеон8 "Я жизу за МКАДом, привезёте?"
    public By accordion8 = By.id("accordion__heading-7");
    // Раскрытый аккордеон1 (Сутки — 400 рублей. Оплата курьеру — наличными или картой.)
    public By openAccordion1 = By.id("accordion__panel-0");
    // Раскрытый аккордеон2 (Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.)
    public By openAccordion2 = By.id("accordion__panel-1");
    // Раскрытый аккордеон3 (Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.)
    public By openAccordion3 = By.id("accordion__panel-2");
    // Раскрытый аккордеон4 (Только начиная с завтрашнего дня. Но скоро станем расторопнее.)
    public By openAccordion4 = By.id("accordion__panel-3");
    // Раскрытый аккордеон5 (Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.)
    public By openAccordion5 = By.id("accordion__panel-4");
    // Раскрытый аккордеон6 (Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.)
    public By openAccordion6 = By.id("accordion__panel-5");
    // Раскрытый аккордеон7 (Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.)
    public By openAccordion7 = By.id("accordion__panel-6");
    // Раскрытый аккордеон8 (Да, обязательно. Всем самокатов! И Москве, и Московской области.)
    public By openAccordion8 = By.id("accordion__panel-7");
    // Кнопка для закрытия куки
    public By cockieCloseButton = By.className("App_CookieButton__3cvqF");
    // Кнопка Заказать на верху страницы
    public By clickBuyButtonUp = By.className("Button_Button__ra12g");
    // Кнопка заказать внизу страницы
    public By clickBuyButtonDown = By.xpath("//div[@class='Home_FinishButton__1_cWm']//button[text()='Заказать']");


    }




