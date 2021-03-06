package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage {

    protected static WebDriver driver;
    private final WebDriverWait wait;



    static{
//        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

//        wait = new WebDriverWait(driver, 10);
    }

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
//        wait = new WebDriverWait(driver, 10);
    }

    public static void navigateTo(String url){
        driver.get(url);
    }

    public static void closeBrowser() {
        driver.quit();
    }

    private WebElement find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void clickElement(String locator) {

        find(locator).click();
    }

    public void enterElement(String locator) {

        find(locator).submit();
    }

    public void write(String locator, String textToWrite){

        find(locator).clear();
        find(locator).sendKeys(textToWrite);
    }

//    public void selectFromDropdownValue(String locator, String valueToSelect){
//        Select dropdown = new Select(find(locator));
//        dropdown.selectByValue(valueToSelect);
//    }

//    public void selectFromDropdownIndex(String locator, int valueToSelect){
//        Select dropdown = new Select(find(locator));
//        dropdown.selectByIndex(valueToSelect);
//    }

}
