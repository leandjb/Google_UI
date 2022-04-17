package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class GooglePage extends BasePage{

    private String searchButton = "(//input[@class='RNmpXc'])[2]";
    private String searchTextField = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input";
    private String searchTextResult = "/html/body/div[7]/div/div[10]/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div/div/div/div[1]/a/h3";
    private String wikiText = "//*[@id='firstHeading']";
    public GooglePage(){

        super(driver);
    }

    public void navigateToGoogle(){

        navigateTo("https://www.google.com/");
    }

    public void enterGoogleSearch(){

        enterElement(searchTextField);
    }

    public void clickWikipedia(){

        clickElement(searchTextResult);
    }

    public void enterSearchCriteria(String criteria){
        write(searchTextField, criteria);

    }

    public void matchResult(String matchText){


        Assert.assertEquals("",
                matchText,
                driver.findElement(By.xpath(wikiText)).getText());
    }
}
