package pages;

import org.junit.Assert;

public class GooglePage extends BasePage{

    private String searchButton = "(//input[@class='RNmpXc'])[2]";
    private String searchTextField = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input";
    private String searchTextResult = "/html/body/div[7]/div/div[10]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div[1]/a/div/cite";

    public GooglePage(){

        super(driver);
    }

    public void navigateToGoogle(){

        navigateTo("https://www.google.com/");
    }

    public void enterGoogleSearch(){

        enterElement(searchTextField);
    }

    public void enterSearchCriteria(String criteria){
        write(searchTextField, criteria);

    }

    public void matchResult(String matchText){

        Assert.assertEquals("Results:", matchText,  searchTextResult);
    }
}
